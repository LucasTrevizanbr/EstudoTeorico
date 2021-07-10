package capitulo16;

public class Collections {
    /*
        Na API de Collection, temos três principais interfaces, List, Set e Map.
        LIST: Quando a sequência é importante. Objetos collection que sabem a posição do índice, permite
        mais de um elemento referenciando o mesmo objeto.
        SET: Quando exclusividade é o que importa. Objetos Collection que não permitem duplicatas.
        MAP: Quando encontrar algo pela chave é importante. Os objetos Map sabem o valor que esta associado
        a uma determinada chave, uma chave pode ser qualquer objeto. Map não estende Collection, mas mesmo assim
        são considerados parte da "estrutura de conjuntos" em Java.Portanto, um objeto Map é considerado um
        conjunto.
            TreeSet<> é semelhante ao HashSet por não permitir duplicatas, mas ele mantém a lista classificada,
        passar um construtor vazio de TreeSet, fara com que ele use o método compareTo() de cada objeto na
        classificação. Para usar um TreeSet ou você implementa Comparable nos elementos da lista ou você
        usará o construtor sobrecarregado do TreeSet que usa uma objeto Comparator.
            Cada elemento de um objeto Map na verdade é composto por DOIS objetos, uma chave e um valor.
        Você pode ter valores duplicados, mas não chaves duplicadas.
     */
}
