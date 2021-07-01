package capitulo4.encapsulamento;

public class CachorroEncapsulado {

    //Variáveis de instância privadas
    private String nome;
    private int tamanho;


    //Métodos de captura e configuração(Getters and Setters) públicos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void latir(){
        if(this.tamanho > 60){
            System.out.println("Woof!! Woof!! Woof!!");
        } else if(this.tamanho > 14){
            System.out.println("Ruff!! Ruff!! Ruff!!");
        }else{
            System.out.println("Yiip!! Yiip!! Yiip!!");
        }
    }

    public void quantasVezesLatir(int numeroDeLatidos){
        while(numeroDeLatidos > 0) {
            this.latir();
            numeroDeLatidos --;
        }
    }


}
