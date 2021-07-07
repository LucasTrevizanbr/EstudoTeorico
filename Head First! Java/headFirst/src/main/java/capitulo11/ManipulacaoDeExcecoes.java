package capitulo11;

public class ManipulacaoDeExcecoes {
    /*
        Construiremos um projeto de "beatbox", onde executaremos arquivos de audio.
              Começamos pela API Java Sound MIDI, MIDI é um protocolo padrão que diferentes tipos de equipamentos
        eletrônicos possam se comunicar, dados MIDI não incluem nenhum som e sim instruções que um instrumento
        leitor de MIDI poderá reproduzir. Ao instânciar um objeto "Sequencer"(responsável por reproduzir os
        MIDI) através do método estático de "MidiSystem.getSequencer()" ele nos avisa que é um método "perigoso"
        e pode falhar em tempo de execução, tudo isso através de "throws".
              Podemos tratar a excessão com blocos "try catch", uma excessão é um objeto do tipo Exception, um
        método que pode lançar uma excessão deve declarar que ele pode lança-lá(throws).Um método pode lançar
        mais de uma exceção, para isso podemos usar quantos blocos "catch" forem necessários, é importante
        que blocos catch do topo da herança fiquem por ultimo, enquanto blocos de nível mais baixo na herança
        fiquem antes.
              Você pode desviar de exceções apenas lançando as com "trhows", quando acontecer uma exceção o
        métood é removido da pilha e a exceção é lançada para o próximo método, mas se ele não tiver o bloco
        "try catch" o método é removido da pilha e a exceção é lançada para o próximo método e assim por diante,
        se chegar no main() o programa será encerrado.

     */
}
