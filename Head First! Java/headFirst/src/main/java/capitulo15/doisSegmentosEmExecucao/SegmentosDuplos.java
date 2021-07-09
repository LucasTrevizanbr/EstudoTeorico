package capitulo15.doisSegmentosEmExecucao;

public class SegmentosDuplos implements Runnable{
    @Override
    public void run() {
        for(int indice = 0; indice < 25; indice++){

            String nomeDoSegmento = Thread.currentThread().getName();
            System.out.println(nomeDoSegmento + " Esta sendo executado");
        }
    }

    public static void main(String[] args) {
        Runnable segmentoDuplo = new SegmentosDuplos();

        Thread alpha = new Thread(segmentoDuplo);
        Thread beta = new Thread(segmentoDuplo);
        alpha.setName("Alpha");
        beta.setName("Beta");

        alpha.start();
        beta.start();
    }
}
