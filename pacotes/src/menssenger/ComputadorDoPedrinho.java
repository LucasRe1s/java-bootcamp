package menssenger;

import menssenger.Apps.FacebookMenssenger;
import menssenger.Apps.MSNMenssenger;
import menssenger.Apps.ServicoMensagemInstatanea;
import menssenger.Apps.Telegram;

public class ComputadorDoPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMenssenger msn = new MSNMenssenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        
        System.out.println("FB");
        FacebookMenssenger fb = new FacebookMenssenger();
        fb.enviarMensagem();
        fb.receberMensagem();
        
        System.out.println("TLG");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

        ServicoMensagemInstatanea smi = null;

        String appEscolhido = "fb";

        if(appEscolhido.equals("msn"))
          smi = new MSNMenssenger();
        else if(appEscolhido.equals("fb"))
          smi = new FacebookMenssenger();
        if(appEscolhido.equals("tgl"))
          smi = new Telegram();
        
          smi.enviarMensagem();
          smi.receberMensagem();

    }
}
