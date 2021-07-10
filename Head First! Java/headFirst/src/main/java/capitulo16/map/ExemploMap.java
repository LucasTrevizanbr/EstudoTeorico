package capitulo16.map;

import java.util.HashMap;

public class ExemploMap {

    public static void main(String[] args) {

        //Definimos uma String como chave e um Integer como valor
        HashMap<String, Integer> pontos = new HashMap<>();

        //A inserção de um map é com put
        pontos.put("Lucas",99);
        pontos.put("Mauro",79);
        pontos.put("And",19);
        pontos.put("Isma",19);

        System.out.println(pontos);

        //Get usa uma chave e retorna um valor
        System.out.println("Pontos do Isma: "+pontos.get("Isma"));
    }
}
