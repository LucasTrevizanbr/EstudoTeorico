package capitulo14.objetosParaGravacaoSerializada;


import java.io.Serializable;

public class Arma implements Serializable {

    private String nomeArma;
    private int poderDeAtaque;

    @Override
    public String toString() {
        return "Nome: "+nomeArma+"/ poder de ataque: "+poderDeAtaque;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public void setPoderDeAtaque(int poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }
}
