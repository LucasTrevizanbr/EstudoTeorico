package capitulo16;

public class ConjuntosETiposGenericos {
    /*
        A Java Collections tem uma estrutura de dados que deve funcionar para praticamente qualquer coisa que
        você precise fazer. No package de jukebox pegamos as musicas de um arquivo e as adicionamos a uma
        ArrayList, mas queremos exibi-las ordenadamente, então podemos usar o método "Collections.sort()".
            Mas e se quisermos ordenar uma lista de objetos? mais detalhes no package jukeboxComObjetos. Usar
        um "Collections.sort()" em um array com objetos de Musica(ou qualquer outro objeto complexo) simplesmente
        não irá compilar, pois o Collections não sabe em que base do objeto Musica ele deve ordenar já que a
        API de Collection utiliza intensamente objetos do tipo genérico.
             Tipos genéricos lidam com conjuntos, antes dos tipos genéricos não era possível "tipar" listas,
        todos os elementos entravam como tipo Object, com a criação dos tipos genéricos vc pode "tipar" listas
        e permitir que só sejam inseridos elementos daquele tipo especificado.
              O "E" nos tipos genéricos significa elemento, ou seja, a classe que você usara como tipo na
        instância do Arraylist. Então "ArrayList<E>" pode ser "ArrayList<Musica>".
              Voltando ao problema original, o método sort() de Collections é assim:
       "public static <T extends Comparable<? super T>> void sort(List<T> list" e isso significa que ele só
       recebe classes que implementem a interface Comparable e só podemos passar um objeto List( ou subtipo de
       List, como Arraylist). Para os tipos genéricos a keyword "extends" significa "é-um" e funciona TANTO
       para classes QUANTO para Interfaces. Extendemos Comparable e implementamos a lógica para ordenar a lista
       por nome da musica.
              Mas e se quisermos ordenar por outro atributo?, existe algo embutido na Java API apenas para essa
       finalidade, quando quisermos classificar a mesma coisa de formas diferentes. Podemos usar o Comparator e
       criar uma classe que implemente e então sobrescrever o método de compare(), para chamar no
       Collections.sort() passamos dois argumentos, a lista a ser ordenada e a classe com o comparator.


     */
}
