package capitulo1;
/*
    Vamos gerar uma frase final que foi embaralhada durante o código
 */
public class ExercicioFraseMatica {
    public static void main(String[] args) {

        //Primeiro criamos três arrays com várias palavras
        String[] listaDePalavrasUm = {"Macarrão","Dólar","Banrisul","Menssageria","Desenvolvedor"};
        String[] listaDePalavrasDois = {"Massa","Cotação","Banco","Kafka","DevOps"};
        String[] listaDePalavrasTres = {"Ravioli","Real","Divida","RabbitMQ","Jenkins"};

        //Vamos usar um método do array pra descobrir o tamanho dele, o length retorna um int com
        //com o tamanho do array(quantas variaveis tem nele)
        int tamanhoListaUm = listaDePalavrasUm.length;
        int tamanhoListaDois = listaDePalavrasDois.length;
        int tamanhoListaTres = listaDePalavrasTres.length;

        /*
            Usamos a classe Math para gerar números aleatórios multiplicados pelo
            tamanho que descobrimos, o random gera um número aleatório entre 0 e quase 1
            então forçamos que ele seja inteiro, multiplicar pelo tamanho do array garante que
            ele não gerará um número maior que o tamanho do array.
         */
        int aleatorio1 = (int) (Math.random() * tamanhoListaUm);
        int aleatorio2 = (int) (Math.random() * tamanhoListaDois);
        int aleatorio3 = (int) (Math.random() * tamanhoListaTres);

        //Construímos a frase usando palavras de cada lista em uma posição aleatória
        String frase = listaDePalavrasUm[aleatorio1]+" "+listaDePalavrasDois[aleatorio2]+" "+
                listaDePalavrasTres[aleatorio3];

        //Exibimos a frase
        System.out.println("Precisamos de "+frase);

    }
}
