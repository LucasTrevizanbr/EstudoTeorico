package capitulo9.objetosCap9;

public class Pato {

    String corDasPenas;
    int tamanhoDoPato;

    //Usando um argumento no construtor referenciando a variável de instância, torno obrigatório
    //o preenchimento da variável de instância pelo usuário ao inicializar um objeto Pato.
    public Pato(int tamanhoDoPato) {
        this.tamanhoDoPato = tamanhoDoPato;
    }

    /*
      Um segundo construtor, padrão. Caso o usuário não queira atribuir um valor para o tamanho do Pato
      dele, então o construtor padrão se encarregará de um tamanho mínimo.
     */
    public Pato(){
        this.tamanhoDoPato = 15;
    }

    public String fazQuaQua(){
        return "Quá! Quá! Quá";
    }

}
