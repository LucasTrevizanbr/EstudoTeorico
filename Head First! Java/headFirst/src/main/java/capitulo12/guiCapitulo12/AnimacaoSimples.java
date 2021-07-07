package capitulo12.guiCapitulo12;

import javax.swing.*;
import java.awt.*;

public class AnimacaoSimples {//Nossa classe externa

    int x = 70;/* variáveis de instância da classe externa para as coordenadas x e y do circulo*/
    int y = 70;

    public static void main(String[] args) {
        AnimacaoSimples gui = new AnimacaoSimples();
        gui.go();
    }

    public void go(){
        JFrame tela = new JFrame();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Criando um Jframe e definindo fechamentoo

        MeuPainelDeDesenho painelDeDesenho = new MeuPainelDeDesenho();//Criando elemento gráfico da classe interna

        tela.getContentPane().add(painelDeDesenho);//inserindo elemento na tela
        tela.setSize(300,300);
        tela.setVisible(true);

        for(int indice = 0 ; indice < 130; indice++ ){//loop pra incrementar as coordenadas
            x++;//coordenadas incrementando
            y++;

            painelDeDesenho.repaint();//Redefine o painel para podermos ver o circulo na nova posição

            try{
                Thread.sleep(50);//retarda um pouco a execução do método para melhor visibilidade
            }catch (InterruptedException excecao){
                System.out.println(excecao.getStackTrace()+"\n"+excecao.getMessage());
            }
        }


    }

    class MeuPainelDeDesenho extends JPanel{//Classe interna

        public void pintarComponente(Graphics graficos){
            graficos.setColor(Color.white);
            graficos.fillRect(0,0,this.getWidth(),this.getHeight());

            graficos.setColor(Color.green);
            graficos.fillOval(x,y,40,40);/*Usa os atributos x e y da classe externa
            que representam as coordenadas continuamente atualizadas*/
        }
    }
}
