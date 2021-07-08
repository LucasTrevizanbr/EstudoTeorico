package capitulo14.gravarStringsEmArquivosDeTxt;

public class CartaoDeQuiz {

    private String pergunta;
    private String resposta;

    public CartaoDeQuiz(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getResposta() {
        return resposta;
    }

}
