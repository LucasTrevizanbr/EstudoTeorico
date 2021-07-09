package capitulo16.jukeboxComObjetos;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBoxComObjetoMusica {

    //O tipo do Array agora é "Musica"
    ArrayList<Musica> listaDeMusicas = new ArrayList<>();

    public static void main(String[] args) {
        new JukeBoxComObjetoMusica().vai();
    }

    public void vai(){
        pegarMusicas();
        System.out.println(listaDeMusicas);
        Collections.sort(listaDeMusicas);
        System.out.println("Musicas em ordem alfabética: "+listaDeMusicas);
    }

    public void pegarMusicas(){
        try{
            File arquivoDeMusicas = new File("capituloLegal/MusicasObjeto.txt");
            BufferedReader leitorDeReader = new BufferedReader(new FileReader(arquivoDeMusicas));

            String linhaComInformacoesMusica = null;
            while((linhaComInformacoesMusica = leitorDeReader.readLine())!=null){
                adicionarMusica(linhaComInformacoesMusica);
            }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


    public void adicionarMusica(String linhaComAtributosDeMusicaParaAnalise){
        //Dividido as linha de arquivo de texto e usando como atributos do objeto musica
        String[] atributosDaMusica = linhaComAtributosDeMusicaParaAnalise.split("/");
        Musica proximaMusica = new Musica(atributosDaMusica[0], atributosDaMusica[1],atributosDaMusica[2],
                atributosDaMusica[3]);
        listaDeMusicas.add(proximaMusica);
    }
}
