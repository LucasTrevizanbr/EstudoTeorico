package capitulo1;

public class MetodoMain {
    /*
        Quando a jvm começa a ser executada, ela procura a classe que você ofereceu na
        linha de comando. Em seguida irá procurar o método main que é o método principal
        de uma aplicação java, ela irá executar tudo que esta dentro desse método.
        Só existe um método main por aplicação

        estrutura de um método main, public para indicar que todos podem acessá-la,
        void é o retorno do método nesse cado é vazio(sem retorno), e após o nome temos
        o parenteses que recebe os argumentos para executar o método, nesse caso ele recebe
        um vetor(array) de strings que se chama "args"
     */
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
    }
    /*
        Executar um programa em java significa informar a jvm para executar uma classe  x e
        em seguida executar seu método main() e continue executando o código até o main terminar.
     */
}
