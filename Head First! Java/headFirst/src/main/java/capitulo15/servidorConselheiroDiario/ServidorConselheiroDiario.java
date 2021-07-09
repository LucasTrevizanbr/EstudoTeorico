package capitulo15.servidorConselheiroDiario;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorConselheiroDiario {

    String[] listaDeConselhos = {"Se exercitar mais forte","Diminuir o intervalo entre as refeições",
    "Fazer uma caminhada a noite de pelo menos 5km","Beber mais água"};

    public void go(){

        try {
            //Esse app vai escutar "solicitações" de cliente na porta 4242 a partir da máquina
            //que esse código esta sendo executado
            ServerSocket socketDoServidor = new ServerSocket(4242);

            while(true){
                /*Método de accept ficará bloqueado até uma solicitação chegar quando chegar ele devolve
                um objeto socket para comunicação com o cliente*/
                Socket socket = socketDoServidor.accept();

                //Usamos a conexão de socket com o cliente para criar um objeto PrintWriter
                PrintWriter escritorDeImpressao = new PrintWriter(socket.getOutputStream());
                String conselho = pegarConselho();

                //enviamos para ele o conselho
                escritorDeImpressao.print(conselho);

                //fechamos a conexão
                escritorDeImpressao.close();
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public String pegarConselho(){
        int aleatorio = (int) (Math.random() * listaDeConselhos.length);
        return listaDeConselhos[aleatorio];
    }

    public static void main(String[] args) {
        ServidorConselheiroDiario servidor = new ServidorConselheiroDiario();
        servidor.go();
    }
}
