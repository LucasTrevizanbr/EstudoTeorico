package capitulo12.clipeMusical;

import javax.sound.midi.*;

public class MiniReprodutorDeMusica {

    public static void main(String[] args) {
        try{
            Sequencer sequenciador = MidiSystem.getSequencer();
            sequenciador.open();

            Sequence sequencia = new Sequence(Sequence.PPQ, 4);
            Track faixa = sequencia.createTrack();

            for(int indice = 5; indice<61;  indice+=4){//Loop para criar eventos usando nosso método estático

                //cria o evento noteOn(144)
                faixa.add(FazerEvento.criarEvento(144,1,indice,100,indice));

                //cria o evento noteOff(128)
                faixa.add(FazerEvento.criarEvento(128,1,indice,100,indice +2));
            }

            sequenciador.setSequence(sequencia);
            sequenciador.setTempoInBPM(220);
            sequenciador.start();
        }catch (InvalidMidiDataException | MidiUnavailableException exception){
            System.out.println(exception.getStackTrace());
        }


    }
}
