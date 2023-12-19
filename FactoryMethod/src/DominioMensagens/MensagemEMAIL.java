package DominioMensagens;

import javax.swing.*;

public class MensagemEMAIL implements Mensagem{
    @Override
    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null,"EMAIL"+mensagem);
    }
}
