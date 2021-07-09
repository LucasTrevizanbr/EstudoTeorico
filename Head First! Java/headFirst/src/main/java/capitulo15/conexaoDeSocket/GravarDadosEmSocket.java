package capitulo15.conexaoDeSocket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/*Para gravar dados em um socket podemos usar o BufferedWriter, mas se tivermos que gravar uma String
de cada vez, PrintWriter será a alternativa padrão.*/
public class GravarDadosEmSocket {
    public static void main(String[] args) {

        try {
            //Cria conexão de soquete com o servidor
            Socket chatSocket = new Socket("127.0.0.1", 5000);

            //Cria um PrintWriter encadeado ao fluxo de saida inferior(conexão) de soquete
            PrintWriter escreverStringNoServidorDeSocket = new PrintWriter(chatSocket.getOutputStream());
            /*O PrintWriter age como sua própria ponte entre os dados de caracteres e os bytes recebidos
            do fluxo de saida de nível inferior do soquete.Encadeando o objeto de saida, podemos gravar
            Strings em um soquete.*/

            //grave (exiba) algo
            escreverStringNoServidorDeSocket.println("Mensagem para ser enviada");
            escreverStringNoServidorDeSocket.print("Outra mensagem");

            /* Então o cliente manda caracteres pelo PrintWriter que encadeado ao fluxo de saida de soquete
            envia bytes para o servidor.*/


        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
