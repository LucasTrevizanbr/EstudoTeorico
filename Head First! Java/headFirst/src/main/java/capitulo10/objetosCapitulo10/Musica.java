package capitulo10.objetosCapitulo10;

public class Musica {

    private String titulo;//Variável de instância que afeta o comportamento de "tocar()"

    public Musica(String titulo) {
        this.titulo = titulo;
    }

    //Método não estático, precisa da minha variável de instância titulo
    public void tocar(){
        TocadorDeMusica player = new TocadorDeMusica();
        player.tocarMusica(titulo);
    }
}
