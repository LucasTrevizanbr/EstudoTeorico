package capitulo14.gravarStringsEmArquivosDeTxt;

import java.io.FileWriter;
import java.io.IOException;

public class GravarTexto {
    public static void main(String[] args) {
        try{
            //cria o arquivo caso ele nao exista, ou se conecta ao arquivo existente
            FileWriter escrever = new FileWriter("TextoSimples.txt");

            //escreve no arquivo criado ou existente
            escrever.write("Olá mundo!");

            //encerra o fluxo
            escrever.close();

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
