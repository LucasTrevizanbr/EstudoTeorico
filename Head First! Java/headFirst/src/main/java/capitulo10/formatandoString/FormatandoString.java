package capitulo10.formatandoString;

import java.util.Date;

public class FormatandoString {

    public static void main(String[] args) {

        /*Formatando um inteiro para que tenha ponto em sua saida, a "%" informa onde inserir o
        segundo argumento, o "d" significa decimal.*/
        String inteiroFormatado = String.format("Resultado do segundo argumento: %,d",10000000);
        System.out.println(inteiroFormatado);

        /*Formatando um double para a saida com duas casas decimais, de acordo com a sintaxe do método
         "f" significa ponto flutuante*/
        String doubleFormatado = String.format("Resultado do double formatado para duas casas decimais: " +
                "%.2f", 389.6666);
        System.out.println(doubleFormatado);

        //Podemos usar variáveis obviamente.
        int posicaoCandidato = 3;
        int candidatosParticipando = 10563;
        String fraseFinalFormatada = String.format("o candidato foi aprovado em %d%c, entre " +
                "%,d candidatos cadastrados.", posicaoCandidato,42, candidatosParticipando);
        System.out.println(fraseFinalFormatada);

        //Existem formatadores para Date também
        Date hoje = new Date();
        String horaDaDataFormatada = String.format("Hora: %tr", hoje);
        String dataEHoraFormatada = String.format("Data e hora completas: %tc", hoje);
        //o "<" significa que queremos usar o mesmo parâmetro para pegar valores diferentes
        String dataFormatada = String.format("Dia da semana: %tA, " +
                "\nMês: %<tB \nDia do mês: %<td", hoje);
        System.out.println(horaDaDataFormatada+"\n"+dataFormatada+"\n"+dataEHoraFormatada);

    }
}
