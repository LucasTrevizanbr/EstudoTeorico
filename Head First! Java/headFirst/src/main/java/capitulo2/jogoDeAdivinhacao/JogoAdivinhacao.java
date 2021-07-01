package capitulo2.jogoDeAdivinhacao;

public class JogoAdivinhacao {

    Jogador jogadorUm;
    Jogador jogadorDois;
    Jogador jogadorTres;


    public void iniciarJogo(){

        jogadorUm = new Jogador();
        jogadorDois = new Jogador();
        jogadorTres = new Jogador();

        int palpiteJogadorUm = 0;
        int palpiteJogadorDois = 0;
        int palpiteJogadorTres = 0;

        boolean jogadorUmEstaCerto = false;
        boolean jogadorDoisEstaCerto = false;
        boolean jogadorTresEstaCerto = false;

        int numeroParaAdivinhar = (int) (Math.random()*10);
        System.out.println("Estou pensando em um número entre 0 e 9....");

        while(true){
            System.out.println("O número a adivinhar é : "+numeroParaAdivinhar);
            jogadorUm.palpite();
            jogadorDois.palpite();
            jogadorTres.palpite();

            palpiteJogadorUm = jogadorUm.numero;
            System.out.println("O jogador um ofereceu o palpite: "+palpiteJogadorUm);
            palpiteJogadorDois = jogadorDois.numero;
            System.out.println("O jogador dois ofereceu o palpite: "+palpiteJogadorDois);
            palpiteJogadorTres = jogadorTres.numero;
            System.out.println("O jogador três ofereceu o palpite: "+palpiteJogadorTres);

            if(palpiteJogadorUm == numeroParaAdivinhar){
                jogadorUmEstaCerto = true;
            }
            if(palpiteJogadorDois == numeroParaAdivinhar){
                jogadorDoisEstaCerto = true;
            }
            if(palpiteJogadorTres == numeroParaAdivinhar){
                jogadorTresEstaCerto = true;
            }

            if(jogadorUmEstaCerto || jogadorDoisEstaCerto || jogadorTresEstaCerto){
                System.out.println("Temos um vencedor!");
                System.out.println("O jogador um acertou?: " + jogadorUmEstaCerto );
                System.out.println("O jogador dois acertou?: " + jogadorDoisEstaCerto );
                System.out.println("O jogador três acertou?: " + jogadorTresEstaCerto );
                break;
            }else{
                System.out.println("Os jogadores terão que tentar novamente.");
            }
        }
    }
}
