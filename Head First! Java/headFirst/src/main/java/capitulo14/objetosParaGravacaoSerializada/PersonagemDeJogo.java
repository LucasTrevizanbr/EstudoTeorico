package capitulo14.objetosParaGravacaoSerializada;

import java.io.Serializable;
import java.util.HashSet;

//Implementando a interface Serializable, que permite ao objeto ser salvo por mecanismos de serialização.
public class PersonagemDeJogo implements Serializable {
    private int poder;
    private String tipo;
    private HashSet<Arma> armas = new HashSet<>();

    public void usarArma(){

    }

    @Override
    public String toString() {
        return "Personagem do tipo: "+tipo+"\n"
                +"Nivel de poder: "+poder+"\n"
                +"Armas: "+armas;
    }

    public void aumentarPoder(){
        this.poder++;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public HashSet<Arma> getArmas() {
        return armas;
    }

    public void setArmas(HashSet<Arma> armas) {
        this.armas = armas;
    }
}
