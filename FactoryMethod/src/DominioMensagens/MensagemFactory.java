package DominioMensagens;

public class MensagemFactory {
    public static Mensagem getmensagem(String tipoDeMensagem){
        if (tipoDeMensagem == "MensagemEmail"){
            return new MensagemEMAIL();
        } else if (tipoDeMensagem == "MensagemSMS") {
            return new MensagemSMS();
        }else return new MensagemSMS();
    }
}
