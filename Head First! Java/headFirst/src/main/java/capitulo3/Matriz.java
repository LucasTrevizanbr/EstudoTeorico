package capitulo3;

import capitulo3.objetosDoCapitulo3.Cachorro;

/*
    Arrays também são objetos
 */
public class Matriz {
    public static void main(String[] args) {
        int[] numeros; //Declarando um objeto matriz de tipos inteiros
        numeros = new int[7]; //criando a referencia de objeto do tipo matriz

        //Atribuindo os valores a cada posição da matriz.
        numeros[0] = 4;
        numeros[1] = 77;
        numeros[2] = 69;
        numeros[3] = 55;
        numeros[4] = 33;
        numeros[5] = 12;
        numeros[6] = 21;
        //Cada posição do objeto matriz é uma variável

        //Também podemos fazer matrizes de objetos
        Cachorro[] meusCachorros;
        meusCachorros = new Cachorro[3];
        meusCachorros[0] = new Cachorro("Ronaldo");
        meusCachorros[1] = new Cachorro("Paquetá");
        meusCachorros[2] = new Cachorro("Thor");

        /*  Quando queremos acessar os métodos ou atributos de um objeto em um array,
         nos referenciamos pela posição do objeto no array */
        meusCachorros[2].comer();
        meusCachorros[1].perseguirGato();

        //Podemos percorrer o array com um loop para acessar cada posição dele.
        int iterador = 0;
        while(iterador < meusCachorros.length){
            meusCachorros[iterador].latir();
            iterador ++;
        }



    }



}
