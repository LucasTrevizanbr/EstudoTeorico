package capitulo12.clipeMusical;

import javax.sound.midi.*;

//Versão 2: registrando e capturando ControllerEvents
public class MiniReprodutorDeMusica2 implements ControllerEventListener {//implementando interface de escuta

    public static void main(String[] args) {
        MiniReprodutorDeMusica2 reprodutor = new MiniReprodutorDeMusica2();
        reprodutor.tocar();

    }

    public void tocar() {
        try{
            Sequencer sequenciador = MidiSystem.getSequencer();
            sequenciador.open();

            //Captura os eventos que eu quero
            int[] eventosQueEuQuero = {127};
            sequenciador.addControllerEventListener(this, eventosQueEuQuero);

            Sequence sequencia = new Sequence(Sequence.PPQ, 4);
            Track faixa = sequencia.createTrack();

            for (int indice = 5; indice < 64 ; indice += 4){

                //MidiEvent noteOn, ocore no "tick" indice
                faixa.add(FazerEvento.criarEvento(144,1,indice,100,indice));

                /*176 significa que o evento é do tipo ControllerEvent, passando o argumento 127
                 que declaramos sendo nosso próprio ControllerEvent. Esse evento não faz nada,
                 apenas o inserimos para poder capturar um evento toda vez que o noteOn tocar, ja
                 que fizemos esse evento ocorrer no mesmo "tick" do noteOn*/
                faixa.add(FazerEvento.criarEvento(176,1,127,0,indice));

                //MMidiEvent noteOff, ocorre no "tick" indice+2
                faixa.add(FazerEvento.criarEvento(128,1,indice,100,indice+2));

            }

            sequenciador.setSequence(sequencia);
            sequenciador.setTempoInBPM(220);
            sequenciador.start();


        }catch (MidiUnavailableException | InvalidMidiDataException ex){
            System.out.println(ex.getStackTrace());
        }
    }

    @Override// o método manipulador de eventos, sempre que capturamos o evento escrevemos "la"
    public void controlChange(ShortMessage event) {
        System.out.println("la");
    }
}
