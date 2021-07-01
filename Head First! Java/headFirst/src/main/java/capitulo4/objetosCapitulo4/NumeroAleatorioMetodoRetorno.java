package capitulo4.objetosCapitulo4;

public class NumeroAleatorioMetodoRetorno {
    int numero;

    //Especificamos o retorno
    public int gerarNumeroAleatorio(){
        this.numero = (int) (Math.random()*20);
        return this.numero;
    }
}
