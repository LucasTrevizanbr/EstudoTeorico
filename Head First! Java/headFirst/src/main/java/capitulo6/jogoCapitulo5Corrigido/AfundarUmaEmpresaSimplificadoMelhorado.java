package capitulo6.jogoCapitulo5Corrigido;

import java.util.ArrayList;

public class AfundarUmaEmpresaSimplificadoMelhorado {

    ArrayList<String> localizacaoDasCelulas;
    //int quantidadeDePalpites = 0;

    public String checarPalpite(String palpite){

        String resultado = "errou!";

        //Agora usaremos os métodos próprios de uma Arraylist para verificação

        int indice = localizacaoDasCelulas.indexOf(palpite);//Verificamos se o palpite existe na lista
        //se existir, retorna o indice do palpite, se não retorna -1;

        //Se o indice for maior ou igual a 0, ou seja, se existir ele entra no if
        if(indice >= 0){
            localizacaoDasCelulas.remove(indice);
            //então removemos o indice do array, impossibilitando que ele seja escolhido de novo

            if(localizacaoDasCelulas.isEmpty()){
                //Se nosso array estiver vazio essa linha vai ser a eliminatória
                resultado = "morte";
            }else{
                resultado = "Acertou";
            }
        }

        System.out.println(resultado);
        return resultado;
    }

    public ArrayList<String> getLocalizacaoDasCelulas() {
        return localizacaoDasCelulas;
    }


    public void setLocalizacaoDasCelulas(ArrayList<String> localizacaoDasCelulas) {
        this.localizacaoDasCelulas = localizacaoDasCelulas;
    }
}
