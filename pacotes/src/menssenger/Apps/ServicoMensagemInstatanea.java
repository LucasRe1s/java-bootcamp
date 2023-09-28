package menssenger.Apps;

public abstract class ServicoMensagemInstatanea {
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }
}
