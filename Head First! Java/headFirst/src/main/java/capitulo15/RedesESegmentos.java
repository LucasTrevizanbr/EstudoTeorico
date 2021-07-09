package capitulo15;

public class RedesESegmentos {
    /*
        Um programa java pode se conectar com um programa de outra máquina, usando a biblioteca java.net,
        um dos maiores benefícios do Java é que enviar e receber dados através de uma rede é apenas E/S com
        um fluxo de conexão um pouco diferente no final da cadeia. Nesse capítulo vamos no conectar com um
        ambiente externo através de soquetes fazendo um bate-papo.
                Visão geral do programa de bate-papo é que o cliente tem que saber da existência do servidor
        e o servidor precisa saber informações sobre TODOS os clientes. Por exemplo, o Cliente A se conecta
        ao servidor, o servidor cria uma conexão e adiciona o cliente a lista de participantes, o Cliente B
        se conecta também ao servidor, o Cliente A envia uma mensagem para o serviço de bate-papo, o servidor
        distribui a mensagem para todos os participantes. Aqui teremos que fazer duas coisas ao mesmo tempo,
        estabelecer uma conexão é uma operação que só ocorre uma vez(funciona ou falha) mas depois disso
        temos que enviar  e receber mensagens simultaneamente com outros participantes.
                O lado do servidor precisa de um objeto ServerSocket para informar aonde o cliente deve se
        conectar pelo objeto Socket(mais ou menos como se ele estivesse escutando as solicitações recebidas
        na porta que ele configurar), o servidor cria outro objeto Socket para se comunicar com o cliente.
                O método accept() ficará bloqueado(apenas aguardando) enquanto estiver esperando uma conexão
        de socket do cliente, quando o cliente tentar conectar o método retornará um objeto Socket simples(em
        uma porta diferente) que saberá se comunicar com esse cliente. O objeto Socket vai estar em uma porta
        diferente do ServerSocket, para que o ServerSocket possa voltar a esperar por outros clientes.
                A versão 1 do bate-papo apenas nos permite enviar(não funciona sem o servidor).A versão
        dois teremos um servidor que irá enviar as mensagens para todos os participantes assim que recebe-la,
        quando um cliente enviar uma mensagem ela não aparecerá na área de exibição até que o servidor
        a envie para todos.
                COMO receber mensagens do servidor: vamos criar um fluxo de entrada(BufferedReader)
         e em seguida ler as mensagens com readline().
                QUANDO você irá receber as mensagens do servidor: teremos que fazer duas coisas ao mesmo tempo,
         um loop que esteja sempre esperando para fazer leituras no servidor e temos que ler as mensagens, vamos
         usar multi thread(múltiplos segmentos).


     */
}
