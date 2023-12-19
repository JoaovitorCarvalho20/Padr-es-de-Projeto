// Importa as classes necessárias do pacote DominioMensagens e do pacote javax.swing
package Principal;
import DominioMensagens.Mensagem;
import DominioMensagens.MensagemFactory;
import javax.swing.*;
import java.util.Scanner;

// Classe principal do programa
public class Main {
    // Constantes que representam os tipos de mensagem
    private static final String TIPO_EMAIL = "MensagemEmail";
    private static final String TIPO_SMS = "MensagemSMS";

    // Método principal que é executado quando o programa é iniciado
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada de dados do console (não utilizado no código atual)
        Scanner input = new Scanner(System.in);

        // Obtém o tipo de mensagem escolhido pelo usuário
        String tipoMensagem = obterTipoMensagem();

        // Obtém o texto da mensagem inserido pelo usuário.
        String texto = obterTexto();

        try {
            // Utiliza a fábrica de mensagens para criar uma instância da mensagem escolhida
            Mensagem mensagem = MensagemFactory.getmensagem(tipoMensagem);

            // Envia a mensagem com o texto fornecido pelo usuário
            mensagem.enviar(texto);
        } catch (IllegalArgumentException e) {
            // Captura uma exceção caso o tipo de mensagem seja inválido e exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Tipo de mensagem inválido");
        }
    }

    // Método para obter o tipo de mensagem do usuário usando uma caixa de diálogo
    private static String obterTipoMensagem() {
        return JOptionPane.showInputDialog("Qual tipo de mensagem? (MensagemEmail/MensagemSMS)");
    }

    // Método para obter o texto da mensagem do usuário usando uma caixa de diálogo
    private static String obterTexto() {
        return JOptionPane.showInputDialog(null, "Digite o texto da mensagem:");
    }
}
/**
 * O padrao de projeto Factory Method é um padrao de projeto criacional
 * ele e bem flexivel uma vez que se pode criar uma interface onde sera criado o metodo base
 * no caso do exemplo criei uma interface Mensagem que define o metodo enviar().
 * E é ai que entra a questáo da flexibilidade uma vez que para defir um tipo diferente de mensagem basta criar uma classe
 * para o tipo da mensagem no caso criei a MensagemSMS e a MensagemEmail, caso eu queria um novo tipo de forma de enviar a mensagem basta
 * apenas criar a nova classe com o tipo de mensagem a ser enviada, por exemplo MensagemPombo vai mandar uma mensagem por um pombo,
 * aiai como eu sou piadista.
 * Entretanto caimos em um problema quando se trata de criar as instancias para fazer a chamada do tipo de mensagem
 * caso eu queira um tipo especifico inicialmente eu teria que criar uma instancia para cada ou mudar manualmente
 * o que não seria muito interesante de se fazer, por conta disso a classe MensagemFactory foi criada ela vai retornar
 * o tipo de mensagem que o usuario desejar, isso deixa o codigo mais simples e elegante;
 * .
 * */
