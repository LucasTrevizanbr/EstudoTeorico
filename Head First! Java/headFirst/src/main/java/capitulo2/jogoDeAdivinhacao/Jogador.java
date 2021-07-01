package capitulo2.jogoDeAdivinhacao;

public class Jogador {

    int numero;

    public int palpite(){
        int numeroDoPalpiteAleatorio = (int) (Math.random()*10);
        this.numero = numeroDoPalpiteAleatorio;
        return this.numero;
    }
}
