package capitulo8;

public class InterfaceEClasseAbstrata {
    /*
        Interfaces são classes 100% abstratas, uma classe que não pode ser instanciada. Uma classe abstrata
        é uma classe que pode ser usada de referência mas que não tem sentido em instância-la, Animal por
        exemplo, serve para abstrair características comuns de animais mas ela por si só não é um objeto
        concreto como leão, tigre ou gato. Você ainda pode usar a classe abstrata como um tipo de referência
        na declaração, para fins de polimorfismo.Toda classe em java é uma extensão de Object sem que precise
        declarar.Podemos executar o método da superclasse e apenas incrementar algo na subclasse caso necessário,
        basta deixar o "super" do método.
            Agora imagine que nossos cachorros e gatos precisam de métodos de animais domésticos, onde
        poderiamos declarar esses métodos sem quebrar a estrutura de herança? para fazer um gato e um cachorro
        serem animais domésticos e lobos e tigres não, podemos usar a interface como uma maneira de fazer
        "herança múltipla". Agora com a interface AnimalDomestico feita, podemos fazer cachorro e gato
        implementa-las e assim assinar um "contrato" onde elas se declaram AnimaisDomesticos e portanto,
        obrigatoriamente devem implementar os métodos da interface e isso torna nossa interface polimorfica.

     */
}
