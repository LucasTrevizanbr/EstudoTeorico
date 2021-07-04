package capitulo8.objetosZooAbstrato;

//Tornando a classe abstrata com a palavra reservada "abstract"
public abstract class Animal {

    String foto;
    String tipoDeAlimento;
    int nivelDeFome;
    double limitesDeEspacoAnimalCircula;
    double localizacao;

    //Um método abstrato deve ser sobrescrito, portanto  não tem corpo
    public abstract void fazerBarulho();

    public abstract void comer();

    public void dormir(){

    }

    public void seMovimentar(){

    }



}
