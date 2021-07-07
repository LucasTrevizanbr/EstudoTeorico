package capitulo12.clipeMusical;

import javax.sound.midi.*;
import javax.swing.*;

public class MiniReprodutorDeMusica3 {

    static JFrame tela = new JFrame("Meu primeiro videoclipe");
    static MeuPainelDeDesenho painelDeDesenho;

    public static void main(String[] args) {
        MiniReprodutorDeMusica3 reprodutor = new MiniReprodutorDeMusica3();
        reprodutor.tocar();

    }

    public void configurarGui(){
        painelDeDesenho = new MeuPainelDeDesenho();
        tela.setContentPane(painelDeDesenho);
        tela.setBounds(30,30,300,300);
        tela.setVisible(true);
    }

    public void tocar() {
        configurarGui();
        try{
            Sequencer sequenciador = MidiSystem.getSequencer();
            sequenciador.open();
            sequenciador.addControllerEventListener(painelDeDesenho, new int[] {127});

            Sequence sequencia = new Sequence(Sequence.PPQ,4);

            Track faixa = sequencia.createTrack();

            int random;
            for(int indice = 0; indice < 60; indice+=4){
                random = (int) ((Math.random() * 50 ));
                faixa.add(FazerEvento.criarEvento(144,1,random,100,indice));
                faixa.add(FazerEvento.criarEvento(176,1,127,0,indice));
                faixa.add(FazerEvento.criarEvento(128,1,random,100,indice+2));
            }

            sequenciador.setSequence(sequencia);
            sequenciador.start();
            sequenciador.setTempoInBPM(220);

        }catch (MidiUnavailableException | InvalidMidiDataException exception){
            System.out.println(exception.getStackTrace());
        }

    }
}
