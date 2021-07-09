package capitulo16.jukebox;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox {

    ArrayList<String> listaDeMusicas = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox().vai();

    }

    public void vai(){
        pegarMusicas();
        System.out.println(listaDeMusicas);
        Collections.sort(listaDeMusicas);//Método static de Collections para ordenação
        System.out.println("Lista em ordem Alfabética: "+listaDeMusicas);

    }

    public void pegarMusicas(){
        try{
           //Instânciamos um objeto de File, passamos o diretório onde queremos pegar esse arquivo.
           File arquivoDeMusicas = new File("capituloLegal/MusicasTocadasJukebox.txt");

           /*Instanciamos um BufferedReader passando como argumento um FileReader que vai ler os caracteres do
           arquivo,enquanto o BufferedReader  le nosso FileReader */
           BufferedReader leitorDoArquivo = new BufferedReader(new FileReader(arquivoDeMusicas));

           //Uma string pra armazenar a linha sendo lida no momento
           String linhaComMusica = null;

           /*Loop para atribuir a linha com a musica ao método de adicionarMusica que "splita" as linhas e
            as adiciona ao Array*/
           while((linhaComMusica = leitorDoArquivo.readLine())!=null){
               adicionarMusica(linhaComMusica);
           }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void adicionarMusica(String linhasParaAnalise){
        //Dividindo as linhas do arquivo pela "/" e pegando somente a primeira posição que é a musica
        String[] token = linhasParaAnalise.split("/");
        listaDeMusicas.add(token[0]);
    }
}
