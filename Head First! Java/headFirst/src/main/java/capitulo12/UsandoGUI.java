package capitulo12;

public class UsandoGUI {
    /*
        Aprendendo a usar interface gráfica do java. Um JFrame é um objeto que representa uma janela na tela,
        você pode inserir elementos gráficos no objeto JFrame(botões, caixa de texto etc).
                Para capturar ActionEvents(Eventos de ação, como clikar e tc) usamos interfaces, cada
         interface referente a um tipo de evento, por exemplo eventos de mouse usa a interface MouseEvent e etc,
         usamos uma interface de ouvinte ActionListener para dizer que nossa classe vai escutar possíveis eventos
         (clicar em um botão por exemplo), fazemos então o elemento ser adicionado a lista de ouvintes com o
         método "botao.addActionListener()" passando como argumento uma classe que implemente a interface, e
         definimos o evento no método "ActionPerformed()" que vem da interface.
                Também é possível criar classes internas, são classes que vivem dentro de uma classe e se
         relacionam diretamente com os atributos e comportamentos da classe externa.
                O capitulo 13 entra mais profundamente em elementos do swing, não tenho interesse nisso agora,
         então sera skipado, não se preocupe com o package 14 depois do 12.

     */
}
