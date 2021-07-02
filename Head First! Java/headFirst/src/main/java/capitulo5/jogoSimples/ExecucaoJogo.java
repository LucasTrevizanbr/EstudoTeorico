package capitulo5.jogoSimples;


public class ExecucaoJogo {
    public static void main(String[] args) {

        int numeroDePalpites = 0;
        int posicaoInicial = (int) (Math.random() *5);
        int[] localizacao = {posicaoInicial,posicaoInicial+1,posicaoInicial+2};

        AfundeUmaEmpresaSimplificado jogo = new AfundeUmaEmpresaSimplificado();
        AuxiliarDoJogo ajudanteJogo = new AuxiliarDoJogo();
        jogo.setLocalizacaoDasCelulas(localizacao);

        boolean empresaEstaViva = true;

        while(empresaEstaViva){
            String palpiteJogador = ajudanteJogo.pegarInputUsuario("Informe um número");
            String resultado = jogo.checarPalpite(palpiteJogador);
            numeroDePalpites ++;
            if(resultado.equals("morte")){
                empresaEstaViva = false;
                System.out.println("Você deu: " + numeroDePalpites+ " palpites");
            }
        }
    }
}
