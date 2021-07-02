package capitulo5.jogoSimples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuxiliarDoJogo {

    public String pegarInputUsuario(String prompt){
        String linhaDeEntrada = null;
        System.out.println(prompt + "  ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            linhaDeEntrada = is.readLine();
            if( linhaDeEntrada.length() == 0) {
                return null;
            }
        }catch (IOException excecao){
            System.out.println("IOException: "+excecao);
        }
        return linhaDeEntrada;
    }
}
