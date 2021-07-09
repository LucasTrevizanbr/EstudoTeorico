package capitulo16.jukeboxComObjetos;

//Agora nossa jukebox vai pegar uma musica como objeto, para termos mais Informações
/*Para podermos usar o método de Collections.sort() precisamos fazer a classe implementar comparable e
sobrescrever seu código*/
public class Musica implements Comparable<Musica> {

    String titulo;
    String artista;
    String avaliacao;
    String bpm;

    public Musica(String titulo, String artista, String avaliacao, String bpm) {
        this.titulo = titulo;
        this.artista = artista;
        this.avaliacao = avaliacao;
        this.bpm = bpm;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return titulo+" : "+artista;
    }



    //Delegando o método de comparação para o objeto String;
    @Override
    public int compareTo(Musica outraMusica) {
       return titulo.compareTo(outraMusica.getTitulo());
    }
}
