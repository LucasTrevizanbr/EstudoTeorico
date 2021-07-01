package capitulo4.objetosCapitulo4;

public class CachorroTesteDrive {
    public static void main(String[] args) {
        Cachorro cachorroUm = new Cachorro("Max",22);
        Cachorro cachorroDois = new Cachorro("Jorge",67);
        Cachorro cachorroTres = new Cachorro("Tuco",11);

        //O comportamento está de acordo com o estado do objeto, no caso a diferença de tamanho
        cachorroUm.latir();
        cachorroDois.latir();
        cachorroTres.latir();

        //usando um método que recebe PARÂMETROS, portanto passamos ARGUMENTOS.
        cachorroDois.quantasVezesLatir(3);

        //Usando um método com retorno
        NumeroAleatorioMetodoRetorno retornaUmNumeroDe0A20 = new NumeroAleatorioMetodoRetorno();
        int numeroGerado = retornaUmNumeroDe0A20.gerarNumeroAleatorio();
        System.out.println("Número retornado pelo método: "+numeroGerado);
    }
}
