package capitulo15.iniciarUmNovoSegmento;

//Uma classe de novo segmento(thread) deve implementar a interface de Runnable
public class NovoSegmento implements Runnable{
    //Na classe que implementa Runnable é onde definiremos que tarefa o segmento executará

    @Override
    public void run() {
        fazAlgo();
    }

    public void fazAlgo(){
        fazMaisAlgo();
    }

    public void fazMaisAlgo(){
        System.out.println("Sou um método da classe Runnable e fui implementando em outro método que meu \n" +
                "run() chama.");
    }

    public static void main(String[] args) {

        //Instânciamos nosso segmento
        Runnable trabalhoDoSegmento = new NovoSegmento();

        /*Passamos o objeto no construtor de um Thread, isso informará ao novoObjeto de Thread
        qual método deve ser inserido no final da nova pilha(o método ruim implementado)*/
        Thread meuSegmento = new Thread(trabalhoDoSegmento);

        //Inicia o objeto de Thread
        meuSegmento.start();

        System.out.println("De volta a pilha main()");
    }
}
