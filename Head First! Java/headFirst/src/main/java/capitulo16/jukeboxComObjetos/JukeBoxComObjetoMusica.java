package capitulo16.jukeboxComObjetos;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class JukeBoxComObjetoMusica {

    //O tipo do Array agora é "Musica"
    ArrayList<Musica> listaDeMusicas = new ArrayList<>();

    //Um set para impedir objetos musicas iguais
    HashSet<Musica> setDeMusicas = new HashSet<>();

    public static void main(String[] args) {
        new JukeBoxComObjetoMusica().vai();
    }

    public void vai(){
        pegarMusicas();
        Collections.sort(listaDeMusicas);
        System.out.println("Todas as músicas reproduzidas: "+ listaDeMusicas);

        //Adicionando uma List de música ao Set de música
        setDeMusicas.addAll(listaDeMusicas);
        System.out.println("Músicas sem duplicatas: "+setDeMusicas);

        //TreeSet não aceita duplicatas e mantém a lista em ordem usando o método compareTo() do objeto
        TreeSet<Musica> musicasEmOrdemSemDuplicata = new TreeSet<>();
        musicasEmOrdemSemDuplicata.addAll(setDeMusicas);
        System.out.println("Músicas sem duplicatas em ordem: "+musicasEmOrdemSemDuplicata);

    }

    public void pegarMusicas(){
        try{
            File arquivoDeMusicas = new File("capituloLegal/MusicasRepetidas.txt");
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
