package capitulo15.appDeBatePapoVersao1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

//Esse classe apenas nos permite enviar mensagens, não tem um servidor ainda, então não funcionará
public class ClienteDeChatSimples {

    JTextField saida;
    PrintWriter escritorDeImpressao;
    Socket socket;

    public static void main(String[] args) {
        new ClienteDeChatSimples().go();
    }

    public void go(){

        //Criando objeto de moldura da tela(Jframe) e painel principal(Jpane)
        JFrame molduraTela = new JFrame("Cliente de mensagens muuuuuito básico");
        JPanel painelPrincipal = new JPanel();

        saida = new JTextField(20);//Inicia a variável de instância

        JButton botaoDeEnviar = new JButton("Enviar");//Criando objeto de botão
        botaoDeEnviar.addActionListener(new botaoDeEnviarOuvinte());//Implementando classe ouvinte no botão

        //Adicionando o campo de texto saida(JTextField) e o botão de enviar ao painel principal
        painelPrincipal.add(saida);
        painelPrincipal.add(botaoDeEnviar);

        //adicional um borda centralizade ao painel principal e depois o adicionando a moldura da tela
        molduraTela.getContentPane().add(BorderLayout.CENTER, painelPrincipal);

        configurarNetworking();//Método de configuração de conexão, iniciado antes da exibição do GUI

        //definindo tamanho da moldura da tela
        molduraTela.setSize(400,500);
        molduraTela.setVisible(true);//habilitando visualização da moldura

    }

    public void configurarNetworking(){

        try {
            //Inicializando variável de instância de socket do tipo Socket
            socket = new Socket("127.0.0.1", 5000);

            //Inicializando variável de instância do tipo PrintWriter encadeando com os dados de socket
            escritorDeImpressao = new PrintWriter(socket.getOutputStream());

            System.out.println("Conexão estabelecida!");

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    //Classe interna para capturar evento do botão de enviar
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
