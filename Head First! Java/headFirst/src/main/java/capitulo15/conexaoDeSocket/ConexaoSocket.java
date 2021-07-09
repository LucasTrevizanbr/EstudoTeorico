package capitulo15.conexaoDeSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*Para se conectar com outra máquina via socket precisamos saber duas coisas:
quem é essa outra máquina: Endereço de IP dela
em que porta ela esta sendo executada : Endereço TCP*/
public class ConexaoSocket {
    public static void main(String[] args) {
        try {
            //Socket com o primeiro argumento IP, e segundo argumento a porta(TCP)
            Socket chatSocket = new Socket("127.0.0.1",5000);

            //Encadeando um InputStreamReader a um fluxo de conexão inferior(chatSocket)
            InputStreamReader stream = new InputStreamReader(chatSocket.getInputStream());
            /*O socket oferece um fluxo de entrada, o InputStream reader é uma ponte entre esse fluxo inferior
            e um fluxo de caracteres de nível superior(BuffereadReader por exemplo)*/

            //Encadeando o BufferedReader ao InputStreamReader(que estava encadeado ao fluxo de conexão inferior
            // que recebemos do socket)
            BufferedReader leitor = new BufferedReader(stream);
            String mensagem = leitor.readLine();

            /*O servidor envia bytes(fluxo de entrada do socket). O InputStreamReader converte esses bytes em
            caracteres e encadeia ao BufferedReader que armazena os caracteres em um Buffer e entrega na String
            "mensagem" ao cliente*/


        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }



}
