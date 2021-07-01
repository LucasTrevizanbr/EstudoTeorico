package capitulo3.objetosDoCapitulo3;

public class Cachorro {
    String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public void latir(){
        System.out.println(this.nome + ": Au!Au!Au!");
    }
    public void perseguirGato(){
        System.out.println(this.nome + ": *perseguindo um gato*");
    }
    public void comer(){
        System.out.println(this.nome + ": *se alimentando*");
    }
}
