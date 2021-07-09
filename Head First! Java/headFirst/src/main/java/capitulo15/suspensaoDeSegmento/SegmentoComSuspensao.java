package capitulo15.suspensaoDeSegmento;

import capitulo15.iniciarUmNovoSegmento.NovoSegmento;

public class SegmentoComSuspensao implements Runnable{
    @Override
    public void run() {
        fazAlgo();
    }

    public void fazAlgo(){
        try{
            //Chamar sleep força o segmento a sair do estado de execução pelo tempo passado como argumento
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fazMaisAlgumaCoisa();
    }

    public void fazMaisAlgumaCoisa(){
        System.out.println("Meu thread após uma suspensão de 2 segundos");
    }

    public static void main(String[] args) {

        Runnable tarefa = new SegmentoComSuspensao();

        Thread segmento = new Thread(tarefa);

        segmento.start();

        System.out.println("Vou printar isso porque estou na pilha de execução do main");



    }
}
