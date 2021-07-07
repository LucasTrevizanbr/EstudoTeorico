package capitulo12.guiCapitulo12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiSimples implements ActionListener {/*Iplementando a interface que diz que nossa classe é
    ouvinte de ações*/

    JButton botao = new JButton("Clique em mim");//Cria um botão


    public static void main(String[] args) {

        GuiSimples tela = new GuiSimples();
        tela.iniciarTela();

    }

    public void iniciarTela(){
        JFrame tela = new JFrame();//Cria uma moldura

        botao.addActionListener(this);/*Adiciona o botão a lista de ouvintes de ações, como argumento
        usamos uma classe que implementa a interface ActionListener(nesse caso "this" é a própria classe
        na qual estamos implementando)*/

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Configuração de encerramento do programa

        tela.getContentPane().add(botao);//pegamos o painel de conteúdo da moldura e adicionamos um botão

        tela.setSize(300,300);//Definindo altura e largura da teça

        tela.setVisible(true);//Tornando a tela visível

    }

    public void mudarTexto(JButton botao){
        botao.setText("Fui clicado");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        botao.setText("Fui clickado! :O");
    }
}
