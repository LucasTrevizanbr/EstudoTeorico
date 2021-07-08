package capitulo14.objetosParaGravacaoSerializada;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DesserializandoObjeto {

    public static void main(String[] args) {
        try{
            //Objeto para se comunicar com o arquivo existente
            FileInputStream fileStream = new FileInputStream("MeuJogo.ser");

            /*Objeto para ler os objetos, mas não se conectará diretamente com o arquivo, por isso encadeado
            com o objeto FileInputStream filestream*/
            ObjectInputStream os = new ObjectInputStream(fileStream);

            //Recuperando os objetos na ordem que foram gravados usando a Superclasse Object
            Object um = os.readObject();
            Object dois = os.readObject();
            Object tres = os.readObject();

            //Forçando conversão pro tipo Personagem de jogo dos objetos desserializados
            PersonagemDeJogo orc = (PersonagemDeJogo) um;
            PersonagemDeJogo elfo = (PersonagemDeJogo) dois;
            PersonagemDeJogo humano = (PersonagemDeJogo) tres;

            //Fechando fluxo
            os.close();

            //Só fiz uma lista para poder fazer um for each e conferir se deu certo
            ArrayList<PersonagemDeJogo> personagensDeJogo = new ArrayList<>();
            personagensDeJogo.add(orc);
            personagensDeJogo.add(elfo);
            personagensDeJogo.add(humano);

            personagensDeJogo.forEach((personagem )-> System.out.println(personagem.toString()));

        }catch (FileNotFoundException exception){
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
