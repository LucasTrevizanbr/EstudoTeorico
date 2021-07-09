package capitulo15.problemaMonicaRyan;

/*Runnable em que ryan e monica verificam o saldo da conta antes de realizar o saque,
mas depois da verificação entram em sleep() e quando acordam retiram de fato o valor*/
public class TarefaRyanMonica implements Runnable{

    //Apenas uma instância de conta bancaria, os dois segmentos acessarão a mesma instância
    private ContaBancaria contaBancaria = new ContaBancaria();

    @Override
    public void run() {
        /*Loop para efetuar retiradas, cada loop tira 10 conto. Um segmento vai percorrer o loop e tentar
        fazer uma retirada a cada interação*/
        for(int retiradas = 0; retiradas < 10; retiradas ++){
            fazerRetiradaAtomica(10);
            if(contaBancaria.getSaldo() < 0){
                System.out.println("ESTOUROU A CONTA!");
            }
        }
    }

    //método sincronizado dos segmentos.
    private synchronized void fazerRetiradaAtomica(int quantidade){

        //Se tivermos mais dinheiro na conta que a quantidade na retirada ele faz isso
        if(contaBancaria.getSaldo() >= quantidade){
            //imprime o nome do thread sendo executado no momento
            System.out.println(Thread.currentThread().getName()+" vai fazer uma retirada");
            try{
                //coloca o thread em suspensão por meio segundo
                System.out.println(Thread.currentThread().getName()+" vai dormir");
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            //thread volta para o estado de execução e executa a retirada
            System.out.println(Thread.currentThread().getName()+" acordou");
            contaBancaria.retirada(quantidade);
            System.out.println(Thread.currentThread().getName()+" concluiu a retirada");
            System.out.println(Thread.currentThread().getName()+ "Retirou 10, agora você tem: "
                    + contaBancaria.getSaldo());

        }else{
            //Quando acabar a grana
            System.out.println("Desculpe: "+Thread.currentThread().getName()+" não tem saldo para retirada");
        }
    }

    private void fazerRetirada(int quantidade){

        //Se tivermos mais dinheiro na conta que a quantidade na retirada ele faz isso
        if(contaBancaria.getSaldo() >= quantidade){
            //imprime o nome do thread sendo executado no momento
            System.out.println(Thread.currentThread().getName()+" vai fazer uma retirada");
            try{
                //coloca o thread em suspensão por meio segundo
                System.out.println(Thread.currentThread().getName()+" vai dormir");
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            //thread volta para o estado de execução e executa a retirada
            System.out.println(Thread.currentThread().getName()+" acordou");
            contaBancaria.retirada(quantidade);
            System.out.println(Thread.currentThread().getName()+" concluiu a retirada");
            System.out.println(Thread.currentThread().getName()+ " Retirou 10, agora você tem: "
                    + contaBancaria.getSaldo());

        }else{
            //Quando acabar a grana
            System.out.println("Desculpe: "+Thread.currentThread().getName()+" não tem saldo para retirada");
        }
    }

    public static void main(String[] args) {
        Runnable tarefaMonicaRyan = new TarefaRyanMonica();

        //Passando a mesma classe Runnable pq ryan e monica fazem a mesma tarefa
        Thread ryan = new Thread(tarefaMonicaRyan);
        Thread monica = new Thread(tarefaMonicaRyan);

        ryan.setName("Ryan");
        monica.setName("Monica");

        ryan.start();
        monica.start();
    }
}
