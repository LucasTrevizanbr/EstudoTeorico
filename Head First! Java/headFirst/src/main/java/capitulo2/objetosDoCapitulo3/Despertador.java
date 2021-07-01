package capitulo2.objetosDoCapitulo3;
import java.time.LocalTime;

public class Despertador {

    //O que um objeto despertador conhece
    LocalTime horaAlarme;
    String modoAlarme; //Chamamos isso de variáveis de instância

    //A instância de uma classe é o objeto em sí, uma classe não é o objeto e sim o molde para
    //construí-lo(construtor), então instânciamos o objeto usando
    // os parâmetros que o construtor pede.

    public Despertador(LocalTime horaAlarme, String modoAlarme) {
        this.horaAlarme = horaAlarme;
        this.modoAlarme = modoAlarme;
    }

    //Os métodos que ele tem, pode chamar de comportamento também
    public void configurarHoraAlarme(){

    }
    public void capturarHoraAlarme(){

    }
    public void alarmeEstaConfigurado(){

    }
    public void soneca(){

    }

}
