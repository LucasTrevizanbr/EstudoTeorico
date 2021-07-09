package capitulo15.appDeBatePapoVersao2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class ServidorSimplesDoClientDeChat {

    ArrayList outputDeStreamsClient;

    public static void main(String[] args) {
        new ServidorSimplesDoClientDeChat().go();
    }

    public class ManipuladorDeCliente implements Runnable{

        BufferedReader leitor;
        Socket socket;

        public ManipuladorDeCliente(Socket socketCliente){
            try{
                socket = socketCliente;
                InputStreamReader isReader = new InputStreamReader(socketCliente.getInputStream());
                leitor = new BufferedReader(isReader);

            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }


        @Override
        public void run() {
            String mensagem;

            try{
               while ((mensagem = leitor.readLine())!= null){
                   System.out.println("Lido: "+mensagem);
                   faleParaTodoMundo(mensagem);
               }
            } catch (IOException exception) {
                exception.printStackTrace();
            }

        }
    }

    public void go(){
        outputDeStreamsClient = new ArrayList();
        try{
            ServerSocket serverSocket = new ServerSocket(5000);

            while(true){
                Socket clienteSocket = serverSocket.accept();
                PrintWriter escrever = new PrintWriter(clienteSocket.getOutputStream());
                outputDeStreamsClient.add(escrever);
                Thread segmento = new Thread(new ManipuladorDeCliente(clienteSocket));
                segmento.start();
                System.out.println("Temos uma conexão");
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void faleParaTodoMundo(String mensagem){
        Iterator isso = outputDeStreamsClient.iterator();
        while (isso.hasNext()){
            try{
                PrintWriter escrever = (PrintWriter) isso.next();
                escrever.println(mensagem);
                escrever.flush();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }


}
