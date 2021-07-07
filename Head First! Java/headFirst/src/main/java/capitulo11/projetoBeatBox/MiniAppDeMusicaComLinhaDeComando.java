package capitulo11.projetoBeatBox;

import javax.sound.midi.*;

public class MiniAppDeMusicaComLinhaDeComando {

    public static void main(String[] args) {
        MiniAppDeMusicaComLinhaDeComando miniApp = new MiniAppDeMusicaComLinhaDeComando();
        if (args.length < 2){
            System.out.println("Não se esqueça dos argumentos de instrumento e da nota");
        } else{
            int instrumento = Integer.parseInt(args[0]);
            int nota = Integer.parseInt(args[1]);
            miniApp.play(instrumento,nota);
        }
    }




    public void play(int instrumento, int nota){

        try{
            Sequencer sequenciador = MidiSystem.getSequencer();
            sequenciador.open();
            Sequence sequencia = new Sequence(Sequence.PPQ, 4);
            Track faixa = sequencia.createTrack();

            MidiEvent evento = null;

            ShortMessage primeiraMensagem = new ShortMessage();
            primeiraMensagem.setMessage(192,1,instrumento,0);
            MidiEvent trocarInstrumento = new MidiEvent(primeiraMensagem, 1);
            faixa.add(trocarInstrumento);

            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,nota,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            faixa.add(noteOn);


            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,nota,100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            faixa.add(noteOff);

            sequenciador.setSequence(sequencia);
            sequenciador.start();

        }catch(MidiUnavailableException excecao){
            System.out.println(excecao.getStackTrace()+"\n"+excecao.getMessage());
        }catch(InvalidMidiDataException excecao){
            System.out.println(excecao.getStackTrace()+"\n"+excecao.getMessage());
        }
    }
}
