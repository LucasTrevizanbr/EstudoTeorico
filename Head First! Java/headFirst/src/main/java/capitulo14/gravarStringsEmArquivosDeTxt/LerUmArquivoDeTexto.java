package capitulo14.gravarStringsEmArquivosDeTxt;

import java.io.*;

public class LerUmArquivoDeTexto {

    public static void main(String[] args) {
        try{
            File meuArquivo = new File("capituloLegal/MeuCodigo.txt");

            //Fluxo de conexão para caracteres, se conecta a um arquivo de texto
            FileReader leitorDeArquivo = new FileReader(meuArquivo);

            /*Encadeia o FileReader a um Buffered reader para uma leitura mais eficiente. Ele voltara ao
            arquivo para ler só quando o buffer estiver vazio(porque o programa ja tera lido tudo) */
            BufferedReader leitor = new BufferedReader(leitorDeArquivo);

            //Armazenar cada linha quando for lida
            String linha = null;

            /*ler uma linha de texto e atribuir a String linha, enquanto não for nula(por ter algo a ser lido)
            exiba a linha que acabou de ler, quando for nulo não tera mais nada a ser lido fechando loop*/
            while((linha = leitor.readLine()) != null){
                System.out.println(linha);
            }
            leitor.close();

        }catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
