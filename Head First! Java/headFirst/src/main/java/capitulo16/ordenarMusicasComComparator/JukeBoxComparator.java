package capitulo16.ordenarMusicasComComparator;


import capitulo16.jukeboxComObjetos.Musica;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeBoxComparator {
    ArrayList<Musica> listaDeMusicas = new ArrayList<>();

    public static void main(String[] args) {
        new JukeBoxComparator().vai();
    }

    public void vai(){
        pegarMusicas();
        System.out.println(listaDeMusicas);
        CompararArtista ordenacaoPorArtista = new CompararArtista();

        //Usamos o método sort() com dois argumentos, a lista e a classe que implementa comparator
        Collections.sort(listaDeMusicas, ordenacaoPorArtista);

        System.out.println("Musicas ordenadas por artistas: "+listaDeMusicas);
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
        capitulo16.jukeboxComObjetos.Musica proximaMusica = new Musica(atributosDaMusica[0], atributosDaMusica[1],atributosDaMusica[2],
                atributosDaMusica[3]);
        listaDeMusicas.add(proximaMusica);
    }

    //Classe interna com o Comparator
    public class CompararArtista implements Comparator<Musica> {

        //Sobrescrevemos o método de compare para comparar artistas
        @Override
        public int compare(Musica musica1, Musica musica2) {
            return musica1.getArtista().compareTo(musica2.getArtista());
        }
    }
}
