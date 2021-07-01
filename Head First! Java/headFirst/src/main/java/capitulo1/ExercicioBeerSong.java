package capitulo1;
/*
    Um pequeno código que derruba uma garrafa de cerveja da parede até que não sobre mais nenhuma.
 */
public class ExercicioBeerSong {
    public static void main(String[] args) {

        int numeroDeCerveja = 99; //Declaramos e atribuímos a variável de controle
        String palavra = "garrafas";//Uma variável auxiliar do código

        while(numeroDeCerveja > 0){ //Condição do loop, enquanto tiver mais garrafas que 0

            if(numeroDeCerveja == 1){ //se tiver apenas 1 cerveja atribui o valor singular na palavra
                palavra = "garrafa";
            }

            System.out.println(numeroDeCerveja +" "+ palavra +" de cerveja na parede");
            System.out.println(numeroDeCerveja +" "+ palavra +" de cerveja.");
            System.out.println("Derrube uma");
            System.out.println("Passe adiante");
            numeroDeCerveja = numeroDeCerveja - 1; // decrementando o loop a cada passagem

            if( numeroDeCerveja == 0) {
                System.out.println("Sem mais garrafas de cerveja na parede");
            }//Se tiver 0 garrafas de cerveja então informa que acabou o loop.
        }
    }


}
