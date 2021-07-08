package capitulo14.objetosParaGravacaoSerializada;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class GravarObjetosSerializados {

    public static void main(String[] args){

        //Objetos a serem salvos
        PersonagemDeJogo personagemUm = new PersonagemDeJogo();
        PersonagemDeJogo personagemDois = new PersonagemDeJogo();
        PersonagemDeJogo personagemTres = new PersonagemDeJogo();

        HashSet<Arma> armasPersonagemUm = new HashSet<>();
        Arma machado = new Arma();
        machado.setNomeArma("Machado de batalha campal");
        machado.setPoderDeAtaque(99);
        armasPersonagemUm.add(machado);

        personagemUm.setTipo("Orc");
        personagemUm.setPoder(60);
        personagemDois.setTipo("Elfo");
        personagemDois.setPoder(50);
        personagemTres.setTipo("Humano");
        personagemTres.setPoder(90);
        personagemUm.setArmas(armasPersonagemUm);

        try{

            /*Um objeto FileOutputStream sabe como se conectar e criar um arquivo, se o arquivo
            "MeuJogo.save" não existir, ele criará automaticamente*/
            FileOutputStream fileStream = new FileOutputStream("MeuJogo.ser");

            /*ObjectOutPutStream permitirá que você grave objetos, mas não poderá se conectar diretamente
            com um arquivo, ele precisa de um objeto auxiliar, nesse caso o "fileStream"*/
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            /*Serializa os objetos referenciados e os grava no arquivo "MeuJogo.save"*/
            os.writeObject(personagemUm);
            os.writeObject(personagemDois);
            os.writeObject(personagemTres);

            //Fechando o fluxo mais abrangente(ObjectOutputStream), fechará os de fluxo inferior(FileOutputStream)
            os.close();

        }catch (FileNotFoundException exception ){
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
