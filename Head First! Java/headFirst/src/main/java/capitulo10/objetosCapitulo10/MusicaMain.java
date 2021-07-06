package capitulo10.objetosCapitulo10;

public class MusicaMain {
    public static void main(String[] args) {

        Musica variavelDeReferenciaObjMusica = new Musica("Tropa do Bruxo - Química bandida");

        variavelDeReferenciaObjMusica.tocar();/*
        Chamando o método não estático, usando a variável de referência do objeto*/

        //Métodos estáticos, usa a classe como referência
        Math.random(); //Retorna um número double aleatório entre 0,0 e 1(não incluso);
        Math.abs(-220);//Retorna um valor absoluto(distância do número até o 0) do argumento passado
        Math.round(13.5F);//Retorna um número arredondado para o valor inteiro mais próximo
        Math.min(5,6);//Retorna o menor valor entre os dois argumentos
        Math.max(10,12);//Retorna o maior valor entre os dois argumentos
    }
}
