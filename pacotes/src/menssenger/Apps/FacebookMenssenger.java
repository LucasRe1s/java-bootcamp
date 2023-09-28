package menssenger.Apps;

public class FacebookMenssenger extends ServicoMensagemInstatanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo FB");
    }
    
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo FB");
       
    }
    
}
