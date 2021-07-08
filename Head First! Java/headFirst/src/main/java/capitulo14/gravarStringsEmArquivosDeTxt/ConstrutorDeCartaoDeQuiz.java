package capitulo14.gravarStringsEmArquivosDeTxt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ConstrutorDeCartaoDeQuiz {

    private JTextArea pergunta;
    private JTextArea resposta;
    private ArrayList<CartaoDeQuiz> listaDeCartoes;
    private JFrame tela;

    public static void main(String[] args) {
        ConstrutorDeCartaoDeQuiz construtor = new ConstrutorDeCartaoDeQuiz();
        construtor.go();
    }

    public void go(){
        tela = new JFrame("Construir cartões de quiz");
        JPanel painelPrincipal = new JPanel();
        Font fonteGrande = new Font("sanserif",Font.BOLD, 24);

        pergunta = new JTextArea(6,20);
        pergunta.setLineWrap(true);
        pergunta.setWrapStyleWord(true);
        pergunta.setFont(fonteGrande);

        JScrollPane perguntaScroller = new JScrollPane(pergunta);
        perguntaScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        perguntaScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        resposta = new JTextArea(6,20);
        resposta.setLineWrap(true);
        resposta.setWrapStyleWord(true);
        resposta.setFont(fonteGrande);

        JScrollPane respostaScroller = new JScrollPane(resposta);
        respostaScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        respostaScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton botaoDeProximo = new JButton("Próximo cartão");

        listaDeCartoes = new ArrayList<CartaoDeQuiz>();

        JLabel perguntaLabel = new JLabel("Pergunta");
        JLabel respostaLabel = new JLabel("Resposta");

        painelPrincipal.add(perguntaLabel);
        painelPrincipal.add(perguntaScroller);
        painelPrincipal.add(respostaLabel);
        painelPrincipal.add(respostaScroller);
        painelPrincipal.add(botaoDeProximo);

        botaoDeProximo.addActionListener(new ProximoCartaoOuvinte());
        JMenuBar barraDeMenu = new JMenuBar();
        JMenu arquivoMenu = new JMenu("Arquivo");
        JMenuItem novoItemDeMenu = new  JMenuItem("Novo");

        JMenuItem salvarItemDeMenu = new JMenuItem("Salvar");
        novoItemDeMenu.addActionListener(new NovoMenuOuvinte());

        salvarItemDeMenu.addActionListener(new SalvarMenuOuvinte());
        arquivoMenu.add(novoItemDeMenu);
        arquivoMenu.add(salvarItemDeMenu);
        barraDeMenu.add(arquivoMenu);

        tela.setJMenuBar(barraDeMenu);
        tela.getContentPane().add(BorderLayout.CENTER, painelPrincipal);
        tela.setSize(500,600);
        tela.setVisible(true);

    }

    //Classes internas para ouvir ações do swing
    public class ProximoCartaoOuvinte implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CartaoDeQuiz cartao = new CartaoDeQuiz(pergunta.getText(),resposta.getText());
            listaDeCartoes.add(cartao);
            limparCartao();
        }
    }

    public class SalvarMenuOuvinte implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            CartaoDeQuiz cartao = new CartaoDeQuiz(pergunta.getText(), resposta.getText());
            listaDeCartoes.add(cartao);

            JFileChooser arquivoSalvo = new JFileChooser();
            arquivoSalvo.showSaveDialog(tela);
            salvarArquivo(arquivoSalvo.getSelectedFile());

        }
    }

    public class NovoMenuOuvinte implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            listaDeCartoes.clear();
            limparCartao();
        }
    }

    //métodos úteis, limpar o cartao e salvar arquivo
    private void limparCartao(){
        pergunta.setText("");
        resposta.setText("");
        pergunta.requestFocus();
    }

    private void salvarArquivo(File arquivo){
        try{
            BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivo));
            for(CartaoDeQuiz cartao : listaDeCartoes ){
                escrever.write(cartao.getPergunta()+"/");
                escrever.write(cartao.getResposta()+"\n");
            }
            escrever.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
