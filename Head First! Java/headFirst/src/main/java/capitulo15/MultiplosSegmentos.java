package capitulo15;

public class MultiplosSegmentos {
    /*
        Queremos aperfeiçoar o app de bate-papo, queremos que você possa enviar mensagens mas ao mesmo tempo
        precisamos de um PROCESSO PARALELO que leia as informações no servidor e exiba na área de texto recebido.
               Para fazer um processo paralelo usamos a classe Thread, um thread(segmento de execução) é
         uma pilha de chamada separada. Thread é a classe do java que representa um segmento.
               A execução da JVM pode ir e voltar entre as pilhas tão rapidamente(pilha com o main() e uma outra
         pilha thread por exemplo) que vai dar a impressão que todas as pilhas estão sendo executadas ao mesmo
         tempo. Uma das coisas que um thread(segmento) deve fazer é controlar que instrução está sendo executada
         atualmente em sua pilha.
                Todos objetos Thread precisam de um Runnable, um objeto Runnable é a tarefa que um segmento
         deve executar. Um novo segmento tem três estados, quando você o instância ele não fará nada, quando
         você o inicia "thread.start()" ele irá para o estado executável o que significa que ele esta pronto
         para ser selecionada para execução, por fim ele entra no estado de execução onde ele é o segmento
         sendo executado atualmente. Só o agendador de segmentos da JVM pode tomar essa decisão.
                Porém há mais. Quando o segmento se torna executável, ele pode se alternar entre executável,
          em execução ou temporariamente não executável(também conhecido como "bloqueado"). Podemos colocar
          um segmento em suspensão com "sleep(quantidade de milisegundos)" para ter certeza que outros segmentos
          terão a chance de serem executados.
                Multiplos segmentos podem levar a um "problema" de concorrência, por exemplo dois ou mais segmentos
          tendo acesso aos dados de um único objeto. Um problema tipo "O lado esquerdo não sabe o que o lado direito
          esta fazendo". Podemos verificar com detalhes o problema no package "problemaMonicaRyan", nesse cenário
          a conta estoura, devemos fazer a Monica ficar impedida de acessar a conta até Ryan acordar e concluir sua
          transação. E vice-versa. Teremos que fazer a transação da conta ficar desbloqueada enquanto ninguém
          a estiver acessando, quando Ryan quiser usar a conta ele fechara ela e levará a chave, quando Ryan tiver
          terminado ele desbloqueia a conta e devolve a chave. Agora a chave está disponível para Monica(ou o Ryan)
          acessar a conta. Precisamos apenas adicionar a palavra synchronized no método de retirada, isso vai
          garantir que um segmento vai executar a ação inteira, do início ao fim, mesmo se entrar em suspensão
          (sleep) durante o método.
                É uma boa prática sincronizar apenas o necessário e a sincronização pode ocorrer em níveis
           mais granulares, como por exemplo, invés de sincronizar um método inteiro, podemos sincronizar
           chamadas de métodos específicos dentro de métodos:
           fazAlgo(){
             synchronized(this){//Aqui fornecemos um argumento que é o objeto cuja chave o segmento tem que obter
                algoCritico()
                algoAindaMaisCritico()
             }
           }

     */
}
