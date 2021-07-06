package capitulo10;

public class NumerosEElementosEstaticos {
    /*
        A classe Math não possui variáveis de instância, os métodos dela sempre atuam sobre o argumento,
        ou seja, o único valor que altera a maneira como o método é executado é o argumento passado para ele.
            Como os métodos da classe Math nunca usam variáveis de instância(já que ela não tem), não
        ganhariamos nada instanciando um objeto do tipo Math, então seu construtor é privado, impedindo que um
        objeto Math seja criado.
            A palavra "static" significa que o método pode ser executado sem uma instância da classe,
        um método ser estático significa que o comportamento dele não depende de uma variável de instância,
        portanto não precisa de um objeto/instância, apenas a classe(assim como os métodos de Math).
            Uma variável "static" é um valor compartilhado por todas as instâncias de uma classe, uma valor
        por classe, invés de um valor por instância. Poderiamos fazer uma variável estática do tipo int em uma
        classe, e incrementa-la no construtor toda vez que essa for instânciada, dessa maneira seria possível
        manter o valor na variável, já que ela seria da classe e não da instância. As variáveis estáticas são
        carregadas antes mesmo de um objeto poder ser criado.
           Uma variável "static final" é como uma constante, a palavra "final" significa que quando inicializada
        ela nunca poderá ser alterada, um bom exemplo disso é a "Math.PI", ela é uma variável
        "public static double PI", public para que qualquer código possa acessa-lá, static para não precisarmos
        de uma instância da classe Math e por convenção letras maiúsculas em seu nome "PI". "final" não é só
        usado em variáveis static, elas podem ser usadas em variáveis de instância, classes e métodos. Em variáveis
        ela as torna constante, em métodos os impedem de serem sobrescritos e em classes de serem estendidas.
     */

}
