package capitulo14;

public class GravarTextoSimples {
    /*
        A classe File representa um arquivo existente em disco, mas não o conteúdo do arquivo. Podemos considerar
        o objeto File como o "nome de um arquivo" ou o diretório dele, mas não o arquivo em sí, a classe File
        não tem métodos de leitura ou gravação. Algo útil em relação a um objeto File é que ele é uma maneira
        muito mais segura de representar um arquivo. Por exemplo, classes que usam um nome de arquivo do tipo
        String no construtor(FileWriter, FileInputStream) podem usar um objeto File em seu lugar. Da pra criar
        um objeto File, verificar se tem um caminho válido e ai oferecer ele a FileWriter ou FileInputStream.
                Buffers fornecem um local temporário de armazenamento para que possamos agrupar coisas até o
        contêiner ficar cheio, é como se fosse um "carrinho de supermercado" você coloca tudo que precisa e leva
        até o carro invés de pegar um produto de cada vez. Então as Strings são inseridas no Buffer, quando o
        BufferedWriter(fluxo de cadeia) ficar cheio as Strings vão ser gravadas no FileWriter(fluxo de destino)
        que as leva ao destino. Não precisamos nem ter uma referência a FileWriter, só nos preocupamos com o
        BufferedWriter, porque ele é o objeto em que chamaremos os métodos e quando o fecharmos ele se encarrega
        do resto da cadeia *BufferedWriter writer = new BufferedWriter(new FileWriter(umArquivo));
                No app de cards de perguntas e respostas, o arquivos que leremos terá a pergunta e a resposta
         na mesma linha "O que resulta de vermelho + azul?/roxo", temos que separar a pergunta da resposta já
         que cada uma é um atributo do CartaoDeQuiz. Usamos o método split de String, "split(/)" vai separar
         nossa String em duas onde passamos o argumento e retornara em um array de String.
     */
}
