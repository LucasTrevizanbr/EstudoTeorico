package capitulo15.appDeBatePapoVersao2;

import capitulo15.appDeBatePapoVersao1.ClienteDeChatSimples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientDeChatMelhorado {

    JTextArea entrada;
    JTextField saida;
    PrintWriter escritorDeImpressao;
    BufferedReader leitor;
    Socket socket;

    public static void main(String[] args) {
        new ClientDeChatMelhorado().go();
    }

    public void go(){

        JFrame molduraTela = new JFrame("Cliente de mensagens muuuuuito básico");
        JPanel painelPrincipal = new JPanel();

        entrada = new JTextArea(15,50);
        entrada.setLineWrap(true);
        entrada.setWrapStyleWord(true);
        entrada.setEditable(false);

        JScrollPane entradaScroller = new JScrollPane(entrada);
        entradaScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        entradaScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        saida = new JTextField(20);

        JButton botaoDeEnviar = new JButton("Enviar");
        botaoDeEnviar.addActionListener(new botaoDeEnviarOuvinte());

        painelPrincipal.add(entradaScroller);
        painelPrincipal.add(saida);
        painelPrincipal.add(botaoDeEnviar);

        configurarNetworking();

        //Iniciando um novo segmento(thread) usando uma nova classe interna como seu Runnable(tarefa)
        Thread leitorDeSegmento = new Thread(new LeitorDeEntrada());
        leitorDeSegmento.start();

        molduraTela.getContentPane().add(BorderLayout.CENTER, painelPrincipal);

        molduraTela.setSize(400,500);
        molduraTela.setVisible(true);

    }

    public void configurarNetworking(){

        try {
            //Inicializando variável de instância de socket do tipo Socket
            socket = new Socket("127.0.0.1", 5000);

            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            leitor = new BufferedReader(streamReader);

            //Inicializando variável de instância do tipo PrintWriter encadeando com os dados de socket
            escritorDeImpressao = new PrintWriter(socket.getOutputStream());

            System.out.println("Conexão estabelecida!");

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    //Classes internas para capturar evento do botão de enviar e rodar a thread



    /*A Runnable vai ficar lendo o fluxo do socket de entrada do servidor e exibir
    qualquer mensagem recebida na área de rolagem de texto*/
    public class LeitorDeEntrada implements Runnable {
        String mensagem;

        @Override
        public void run() {
            try {
                while ((mensagem = leitor.readLine()) != null) {
                    System.out.println("Lido: " + mensagem);
                    entrada.append(mensagem + "\n");
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }



    public class botaoDeEnviarOuvinte implements ActionListener {

        //O que fazer quando clicar no botão de enviar
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                //printa a saida
                escritorDeImpressao.println(saida.getText());

                //força o conteúdo a efetivamente ser escrito em disco
                escritorDeImpressao.flush();

            }catch (Exception ex){
                ex.printStackTrace();
            }

            //limpa a text area de saida
            saida.setText("");
            saida.requestFocus();

        }
    }
}

