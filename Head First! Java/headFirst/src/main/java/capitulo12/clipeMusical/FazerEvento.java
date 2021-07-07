package capitulo12.clipeMusical;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class FazerEvento {

    //método estático para criar a mensagem e retornar um MidiEvent
    public static MidiEvent criarEvento(int comd, int chan, int um, int dois, int tick){
        MidiEvent evento = null;
        try{
            ShortMessage a = new ShortMessage();
            a.setMessage(comd,chan,um,dois);//seta a mensagem com os parâmetros
            evento = new MidiEvent(a, tick);//cria o evento com a mensagem e a batida por parâmetro

        }catch (InvalidMidiDataException exception){
            System.out.println(exception.getStackTrace());
        }
        return evento;
    }
}
