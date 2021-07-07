package capitulo11.projetoBeatBox;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicaTeste {

    //O throws nos diz que o método pode falhar e por isso o compilador deve saber que NÓS sabemos dessa
    // possibilidade, podemos envelopar nosso código em um bloco try catch para tratar a excessão
    public void  play(){

        try{//Ele vai tentar instanciar nosso sequencer

            /*Precisamos de um sequenciador para reproduzir os arquivos MIDI, ele pega todos os dados MIDI
            e envia para o instrumento certo*/
            Sequencer sequenciador = MidiSystem.getSequencer();
            System.out.println("Temos um sequenciador");

        }catch(MidiUnavailableException excessao){//Caso ele de uma excessão, então capturamos ela
            //e aqui apenas retornamos o resultado dela.
            System.out.println("Tivemos esse problema: "+excessao);
        }

    }

}
