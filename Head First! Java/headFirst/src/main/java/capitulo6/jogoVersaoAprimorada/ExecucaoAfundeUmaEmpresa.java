package capitulo6.jogoVersaoAprimorada;

import java.util.ArrayList;

public class ExecucaoAfundeUmaEmpresa {

    private AuxiliarAfundeUmaEmpresa auxiliarDoJogo = new AuxiliarAfundeUmaEmpresa();
    private ArrayList<Empresa> listaDeEmpresa = new ArrayList<>();
    private int  numeroDePalpite = 0;

    public void configurarJogo(){
        Empresa empresaUm = new Empresa();
        empresaUm.setNome("Magalu");

        Empresa empresaDois = new Empresa();
        empresaDois.setNome("Mercado Livre");

        Empresa empresaTres = new Empresa();
        empresaTres.setNome("Amazon");

        this.listaDeEmpresa.add(empresaUm);
        this.listaDeEmpresa.add(empresaDois);
        this.listaDeEmpresa.add(empresaTres);

        System.out.println("Seu objetivo é eliminar três empresas da internet");
        System.out.println(empresaUm.getNome()+", "+empresaDois.getNome()+", "+empresaTres.getNome());
        System.out.println("Tente eliminar todas com o menor número de palpites!!");

        for(Empresa empresaParaConfigurar : this.listaDeEmpresa){
            ArrayList<String> novaLocalizacao = this.auxiliarDoJogo.colocarEmpresa(3);
            empresaParaConfigurar.setLocalizacaoDasCelulas(novaLocalizacao);
        }

    }

    public void começarJogo(){
        while(!this.listaDeEmpresa.isEmpty()){
            String palpiteDoJogador = this.auxiliarDoJogo.pegarInputUsuario("Insira um palpite:");
            this.checarPalpiteUsuario(palpiteDoJogador);
        }
        this.terminarJogo();
    }

    public void checarPalpiteUsuario(String palpite){
        this.numeroDePalpite ++;
        String resultado = "Errou!";

        for(Empresa empresaParaTestar: this.listaDeEmpresa){
            resultado = empresaParaTestar.checarPalpite(palpite);
            if(resultado.equals("Acertou")){
                break;
            }
            if(resultado.equals("Eliminar")){
                this.listaDeEmpresa.remove(empresaParaTestar);
                break;
            }
        }
        System.out.println("Resultado");
    }


    public void terminarJogo(){
        System.out.println("Todas as empresas foram eliminadas! Agora seu conjunto está vazio.");
        if(this.numeroDePalpite <= 18){
            System.out.println("Você só usou: "+this.numeroDePalpite+" palpites");
            System.out.println("Você saiu antes de eliminar suas opções");
        }else{
            System.out.println("Demorou demais. "+this.numeroDePalpite+" palpites");
            System.out.println("Não afundou nenhuma empresa com essas opções.");
        }

    }

    public static void main(String[] args) {
        ExecucaoAfundeUmaEmpresa jogo = new ExecucaoAfundeUmaEmpresa();
        jogo.configurarJogo();
        jogo.começarJogo();
    }
}
