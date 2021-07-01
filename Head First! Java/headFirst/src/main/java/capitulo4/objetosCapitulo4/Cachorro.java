package capitulo4.objetosCapitulo4;

public class Cachorro {
    String nome;
    int tamanho;

    public Cachorro(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    //Os atributos do objeto definem como vai ser o comportamento dele
    public void latir(){
        if(this.tamanho > 60){
            System.out.println("Woof!! Woof!! Woof!!");
        } else if(this.tamanho > 14){
            System.out.println("Ruff!! Ruff!! Ruff!!");
        }else{
            System.out.println("Yiip!! Yiip!! Yiip!!");
        }
    }

    //Um método que recebe parâmetros
    public void quantasVezesLatir(int numeroDeLatidos){
        while(numeroDeLatidos > 0) {
            this.latir();
            numeroDeLatidos --;
        }
    }
}
