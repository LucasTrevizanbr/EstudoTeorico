package capitulo14;

public class SerializacaoEntradaSaidaDeArquivos {
    /*
        Existem varias opções de como salvar o estado do seu programa em java, e a que escolher provavelmente
        vai depender de como deseja usar o estado salvo. Se seus dados forem usados SOMENTE PELO PROGRAMA JAVA
        QUE OS GEROU use "serializacao". Se seus dados forem usados EM OUTROS PROGRAMAS grave um arquivo de
        texto simples.
            O API de E/S Java tem fluxos de conexão que representam origens e destinos, e fluxos de cadeia
        que só funcionam encadeados a outros fluxos. Geralmente são necessários pelo menos dois fluxos vinculados
        para que algo útil possa ser feito, um para representar a conexão e outro para chamar métodos.
            O que acontece quando combinas o FileOutputStream e o ObjectOutputStream é que nosso objeto é gravado
        em um fluxo de cadeia(ObjectOutputStream) que vai achatar ele(serializar) e depois é encadeado no
        FileOutputStream(um fluxo de conexão) que vai gravar em forma de bytes no arquivo *checar o pacote
        objetosParaGravacaoSerialiada para mais detalhes*.
            Ser serializado significa que os objetos salvam seus valores das variáveis de instância para que
        uma instância(objeto) possa ser reconstituído no heap. Tudo que um objeto serializado tem como variável
        de instância é automaticamente serializado com ele para que possamos ter um valor idêntico na hora de
        reconstituí-lo, para isso precisamos implementar a interface "Serializable". Se  você não quiser
        que uma variável de instância seja serializada, use a palavra "transient".
            Para desserializar um objeto ocorre o processo inverso, o arquivo é lido pelo FileInputStream(fluxo
        de conexão), depois encadeado ao ObjectInputStram(fluxo de cadeia) que vai encontrar a classe, carrega-la
        e reatribuir as variáveis de instância salvas *checar classe DesserializandoObjeto para detalhes*.
            Algo que pode afetar a desserialização são mudanças na classe depois que ela tiver sido serializada,
         como excluir uma variável de instância, remover serialização de alguma classe que seja variável de
         instância, alterar o tipo declarado da variável de instância, alterar uma variável de instância para
         static.

     */
}
