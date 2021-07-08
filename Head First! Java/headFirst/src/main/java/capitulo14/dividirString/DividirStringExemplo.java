package capitulo14.dividirString;

public class DividirStringExemplo {
    public static void main(String[] args) {
        String fraseParaDividir = "O que resulta de vermelho + azul?/roxo";

        String[] resultado = fraseParaDividir.split("/");

        for(String fraseDividida : resultado ){
            System.out.println(fraseDividida);
        }
    }
}
