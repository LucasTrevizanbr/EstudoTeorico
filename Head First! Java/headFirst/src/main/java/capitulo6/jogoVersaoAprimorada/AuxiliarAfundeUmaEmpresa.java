package capitulo6.jogoVersaoAprimorada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AuxiliarAfundeUmaEmpresa {

    private static final String alfabeto = "abcdefg";
    private int quantidadeColunaDaGrade  = 7;
    private int quantidadeLinhaDaGrade = 49;
    private int[] grade = new int[quantidadeLinhaDaGrade];
    private int contagemEmpresa = 0;


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

    public ArrayList<String> colocarEmpresa(int quantidadeDeEmpresa) {
        ArrayList<String> celulasAlpha = new ArrayList<>();
        String[] coordenadasAlpha = new String[quantidadeDeEmpresa];
        String temp = null;
        int[] coordenadas = new int[quantidadeDeEmpresa];
        int tentativas = 0;
        boolean sucesso = false;
        int localizacao = 0;
        this.contagemEmpresa ++;
        int incrementoHorizontal = 1;
        if((this.contagemEmpresa %2) ==1){
            incrementoHorizontal = quantidadeLinhaDaGrade;
        }
        while( !sucesso & tentativas++ <200){
            localizacao = (int) (Math.random()* quantidadeColunaDaGrade);
            int x = 0;
            sucesso = true;
            while (sucesso && x < quantidadeDeEmpresa){
                if (grade[localizacao] == 0){
                    coordenadas[x++] = localizacao;
                    localizacao += incrementoHorizontal;
                    if (localizacao >= quantidadeColunaDaGrade){
                        sucesso = false;
                    }
                    if (x > 0 && (localizacao % quantidadeColunaDaGrade == 0)){
                        sucesso = false;
                    }
                }else{
                    sucesso = false;
                }
            }
        }
        int x = 0;
        int linha = 0;
        int coluna = 0;
        while (x < quantidadeDeEmpresa){
            grade[coordenadas[x]] = 1;
            linha = (int) (coordenadas[x]/ quantidadeLinhaDaGrade);
            temp = String.valueOf(alfabeto.charAt(coluna));
            celulasAlpha.add(temp.concat(Integer.toString(linha)));
        }
        return celulasAlpha;
    }
}
