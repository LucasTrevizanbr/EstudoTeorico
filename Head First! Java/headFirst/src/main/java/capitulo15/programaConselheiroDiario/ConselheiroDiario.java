package capitulo15.programaConselheiroDiario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConselheiroDiario {

    public void go(){
        try{
            //Cria uma conexão de socket com o que estiver rodando na porta 4242 do host local.
            Socket conexaoDeSocket = new Socket("127.0.0.1",4242);

            //Encadeando um BufferedReader a um InputStreamReader que é encadeado ao fluxo de entrada do socket
            InputStreamReader leitorDeStream = new InputStreamReader(conexaoDeSocket.getInputStream());
            BufferedReader leitor = new BufferedReader(leitorDeStream);

            String conselho = leitor.readLine();
            System.out.println("Hoje você deveria: "+conselho);

            leitor.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConselheiroDiario conselheiro = new ConselheiroDiario();
        conselheiro.go();
    }
}
