package capitulo11.projetoBeatBox;

import javax.sound.midi.*;

public class MiniAppMusica {

    public static void main(String[] args){
        MiniAppMusica appDeMusica = new MiniAppMusica();
        appDeMusica.play();

    }
    
    
    public void play(){
        
        try{
            Sequencer sequenciador = MidiSystem.getSequencer();//Instância um sequencer através de um método static

            sequenciador.open();//Abre o sequenciador

            Sequence sequencia = new Sequence(Sequence.PPQ, 4);/*A musica a ser reproduzida pelo
            sequenciador usando valores pré-setados*/

            Track faixa = sequencia.createTrack();/*Solicita a sequencia um objeto Track(faixa), os dados MIDI
            residem no objeto Track, enquanto o objeto Track reside no objeto Sequence.*/

            /*Inserindo eventos MIDI na faixa que residira na sequencia, que o sequenciador reproduzirá.
            Grande parte são códigos pré-definidos*/
            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,33,100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            faixa.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b, 3);
            faixa.add(noteOff);

            sequenciador.setSequence(sequencia);//Informa a sequencia ao sequenciador

            sequenciador.start();//inicia o sequenciador.



        }catch(MidiUnavailableException excecao){
            System.out.println(excecao.getStackTrace()+"\n"+excecao.getMessage());
        }catch(InvalidMidiDataException excecao){
            System.out.println(excecao.getStackTrace()+"\n"+excecao.getMessage());
        }
    }


}
