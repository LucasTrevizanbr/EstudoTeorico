package capitulo15.problemaMonicaRyan;

//Conta bancaria compartilhada para Ryan e Monica, o objeto em comum a qual dois threads tem acesso
public class ContaBancaria {
    private int saldo = 100;


    public int retirada(int quantidadeRetirada){
        return this.saldo -= quantidadeRetirada;
    }

    public int getSaldo() {
        return saldo;
    }
}
