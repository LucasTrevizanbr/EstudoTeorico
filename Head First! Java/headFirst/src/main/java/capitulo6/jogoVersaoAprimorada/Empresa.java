package capitulo6.jogoVersaoAprimorada;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    ArrayList<String> localizacaoDasCelulas;


    public String checarPalpite(String palpite){

        String resultado = "errou!";
        int indice = localizacaoDasCelulas.indexOf(palpite);
        if(indice >= 0){
            localizacaoDasCelulas.remove(indice);

            if(localizacaoDasCelulas.isEmpty()){
                resultado = "Eliminar";

                System.out.println("Boa! você afundou a "+this.nome+" :(");
            }else{
                resultado = "Acertou";
            }
        }
        System.out.println(resultado);
        return resultado;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getLocalizacaoDasCelulas() {
        return localizacaoDasCelulas;
    }

    public void setLocalizacaoDasCelulas(ArrayList<String> localizacaoDasCelulas) {
        this.localizacaoDasCelulas = localizacaoDasCelulas;
    }
}
