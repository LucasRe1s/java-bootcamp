package menssenger.Apps;

public class Telegram extends ServicoMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
        
    }
    
}
