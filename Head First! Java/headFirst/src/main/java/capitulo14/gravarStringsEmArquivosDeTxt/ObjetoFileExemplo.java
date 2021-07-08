package capitulo14.gravarStringsEmArquivosDeTxt;

import java.io.File;

public class ObjetoFileExemplo {
    public static void main(String[] args) {

        //Cria um objeto file que representa um arquivo existente
        File arquivo = new File("capituloLegal/MeuCodigo.txt");


        //cria um novo diretório
        File diretorio = new File("capituloLegal");
        diretorio.mkdir();


        //lista o conteúdo do diretório
        if(diretorio.isDirectory()){
            String[] conteudoDiretorio = diretorio.list();
            for (int indice = 0; indice < conteudoDiretorio.length; indice ++){
                System.out.println(conteudoDiretorio[indice]);
            }
        }

        //pega o caminho absoluto do diretório
        System.out.println(diretorio.getAbsolutePath());

        //deleta arquivo
        System.out.println(arquivo.delete());

    }
}
