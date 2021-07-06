package capitulo10.trabalhandoComCalendar;

import java.util.Calendar;
import java.util.Date;


public class MainCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        //Configura o calendário para 08/01/2021 as 13:30
        calendario.set(2021,0,8,13,30);
        System.out.println(calendario.getTime());

        //Converte o valor para milisegundos
        long dataEmMilisegundos = calendario.getTimeInMillis();

        //Adiciona dias a data
        calendario.add(Calendar.DATE,32);
        System.out.println("Adicionou 32 dias: " + calendario.getTime());

        /*Avança dias a partir da data, porém NÃO altera o mês, ele usa o parâmetro anterior que
        adicionou 32 dias a data inicial*/
        calendario.roll(Calendar.DATE,32);
        System.out.println("Avançou 32 dias: "+calendario.getTime());





    }






}
