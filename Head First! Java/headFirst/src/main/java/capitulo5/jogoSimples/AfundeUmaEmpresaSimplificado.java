package capitulo5.jogoSimples;

public class AfundeUmaEmpresaSimplificado {

    int[] localizacaoDasCelulas;
    int quantidadeDePalpites = 0;

    public String checarPalpite(String palpite){
        int palpiteConvertidoParaInteiro = Integer.parseInt(palpite);
        String resultado = "errou!";

        //Este for contém um erro na execução, não consideramos o fato do jogador inserir o mesmo palpite
        for(int celula : this.localizacaoDasCelulas){
            if(palpiteConvertidoParaInteiro == celula){
                resultado = "Acertou";
                this.quantidadeDePalpites ++;
                break;
            }
        }

        if(this.quantidadeDePalpites == this.localizacaoDasCelulas.length){
           resultado = "morte";
        }

        System.out.println(resultado);
        return resultado;
    }

    public int[] getLocalizacaoDasCelulas() {
        return localizacaoDasCelulas;
    }

    public int getQuantidadeDePalpites() {
        return quantidadeDePalpites;
    }

    public void setLocalizacaoDasCelulas(int[] localizacaoDasCelulas) {
        this.localizacaoDasCelulas = localizacaoDasCelulas;
    }
}
