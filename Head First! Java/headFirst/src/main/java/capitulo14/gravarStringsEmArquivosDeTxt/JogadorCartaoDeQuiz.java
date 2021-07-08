package capitulo14.gravarStringsEmArquivosDeTxt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class JogadorCartaoDeQuiz {

    private JTextArea exibicao;
    private JTextArea resposta;
    private ArrayList<CartaoDeQuiz> listaDeCartoes;
    private CartaoDeQuiz cartaoAtual;
    private int cartaoAtualIndice;
    private JFrame tela;
    private JButton botaoDeProximo;
    private boolean mostrarResposta;


    public void go(){
        tela = new JFrame("Jogador dos Cartões de Quiz");
        JPanel painelPrincipal = new JPanel();
        Font letraGrande = new Font("sanserif",Font.BOLD,24);

        exibicao = new JTextArea(10,20);
        exibicao.setFont(letraGrande);
        exibicao.setLineWrap(true);
        exibicao.setEditable(false);

        JScrollPane perguntaScroller = new JScrollPane(exibicao);
        perguntaScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        perguntaScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        botaoDeProximo = new JButton("Mostrar pergunta");
        painelPrincipal.add(perguntaScroller);
        painelPrincipal.add(botaoDeProximo);
        botaoDeProximo.addActionListener(new ProximoCartaoOuvinte());

        JMenuBar barraDeMenu = new JMenuBar();
        JMenu arquivoMenu = new JMenu("Arquivo");
        JMenuItem carregarItemDeMenu = new JMenuItem("Carregar cartões");
        carregarItemDeMenu.addActionListener(new AbrirMenuOuvinte());
        arquivoMenu.add(carregarItemDeMenu);
        barraDeMenu.add(arquivoMenu);

        tela.setJMenuBar(barraDeMenu);
        tela.getContentPane().add(BorderLayout.CENTER, painelPrincipal);
        tela.setSize(640,500);
        tela.setVisible(true);
    }

    public class ProximoCartaoOuvinte implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(mostrarResposta){
                exibicao.setText(cartaoAtual.getResposta());
                botaoDeProximo.setText("Próximo Cartão");
                mostrarResposta = false;
            }else{
                if(cartaoAtualIndice < listaDeCartoes.size()){
                    mostrarProximoCartao();
                }else{
                    exibicao.setText("Esse foi o último cartão");
                    botaoDeProximo.setEnabled(false);
                }
            }
        }
    }

    public class AbrirMenuOuvinte implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser arquivoAberto = new JFileChooser();
            arquivoAberto.showOpenDialog(tela);
            carregarArquivo(arquivoAberto.getSelectedFile());
        }
    }

    public void carregarArquivo(File arquivo){
        listaDeCartoes = new ArrayList<CartaoDeQuiz>();
        try{
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            String linha = null;
            while ((linha = leitor.readLine()) != null){
                fazerCartao(linha);
            }
            leitor.close();

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void fazerCartao(String linhaParaParsear){
        String[] resultado = linhaParaParsear.split("/");
        CartaoDeQuiz cartao = new CartaoDeQuiz(resultado[0],resultado[1]);
        listaDeCartoes.add(cartao);
        System.out.println("Fiz um cartão!");
    }

    public void mostrarProximoCartao(){
        cartaoAtual = listaDeCartoes.get(cartaoAtualIndice);
        cartaoAtualIndice++;
        exibicao.setText(cartaoAtual.getPergunta());
        botaoDeProximo.setText("Mostrar resposta");
        mostrarResposta = true;
    }
}
