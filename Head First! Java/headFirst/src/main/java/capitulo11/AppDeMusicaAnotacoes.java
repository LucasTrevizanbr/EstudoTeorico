package capitulo11;

public class AppDeMusicaAnotacoes {
    /*
        O objeto Message do app de música diz que nota deve ser reproduzida. A instrução "a.setMessage()"
        insere no objeto de Message a nota de acordo com os argumentos passados. O MidiEvent é criado
        passando o objeto mensagem por argumento e o momento em que ele deve ser executado, a mensagem
        possui as instruções, o MidiEvent solicita que ela seja tocada na batida 1 "new MidiEvent(a, 1)",
        depois disso adicionamos o MidiEvent no objeto track "faixa.add(noteOn)", o objeto tack armazena todos os
        MidiEvents, o objeto Sequence organiza de acordo com o momento em que cada um tem que ocorrer e o
        Sequencer o reproduzirá na ordem.
              Os argumentos de uma mensagem são
        "a.setMessage("tipo da mensagem", "canal", "nota a reproduzir", "velocidade"), os 3 ultimos argumentos
        variam de acordo com o tipo da message. O tipo 144 significa noteOn(comece a reproduzir), 128 significa
        noteOff(pare de reproduzir). O canal significa algo como o "músico de uma banda", canal 1 é o músico 1
        (tecladista), o canal 9 é o baterista etc.. A nota a reproduzir é um número de 0 a 127, indo das notas
        baixas às altas. Velocidade é a rapidez e intensidade que você pressionou a tecla.

     */
}
