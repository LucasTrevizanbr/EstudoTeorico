package capitulo9;

public class ConstrutoresEColetaDeLixo {
    /*
        Nós criamos objetos e nós precisamos destruí-los, em java não somos nós que o destruímos de fato,
        na verdade nós o abandonamos e deixamos que o coletor de lixo o remova, solicitando a memória que
        o objeto estava usando.
            Os objetos residem na memória "heap", as chamadas de métodos e as variáveis locais residem na
        "pilha". O cenário de uma "pilha" é porque a jvm vai empilhando métodos, de maneira que se um método
        "y" chamar um método "x", ele empilhara x acima de y e assim sucessivamente, depois ele irá executar
        sempre o método que esta no topo da pilha. Mesmo que um objeto seja declarado dentro de um método
        ele ainda sim será criado na memória "heap", embora o método seja da memória de "pilha".
            As variáveis de instância residem no "heap" dentro do objeto a qual elas pertencem, se um
        objeto tiver uma variável de instância que faz referência a outro objeto ela criará o objeto
        também no "heap" DESDE QUE NA DECLARAÇÃO A VARIÁVEL DE INSTÂNCIA TENHA SIDO INICIALIZADA.
            Construtor é o "()" após a declaração de "new Classe", um construtor contém o código que será
        executado quando instanciarmos um objeto. O construtor é executado antes do objeto poder ser
        atribuído a uma referência, isso é um recurso que podemos usar para deixar explicito como um objeto
        daquela classe deve ser construído, se vc não declarar um construtor explicitamente então
        implicitamente ele será um construtor padrão, mas a partir do momento que você explicita um
        construtor o compilador usará somente o explicitado, então caso seja necessário você pode criar
        vários construtores através da sobrecarga.
            Quando instanciarmos uma subclasse também carregamos todos os construtores da superclasse, isso
        significa que quando chamarmos "Cachorro()" que estende "Canino()" que estende "Animal()" que estende
        "Object()", ele ira empilhar cachorro->canino->animal->object, depois irá executar o método no top e
        irá decrescendo até que o método chamado inicialmente esteja no topo da pila, então:
        object->animal->canino->cachorro, assim ele executa todos os super construtores para que tudo funcione
        corretamente no nível mais baixo da herança.
     */
}
