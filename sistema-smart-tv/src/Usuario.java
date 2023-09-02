public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(15);


        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo Status -> TV LIGADA ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV LIGADA ? " + smartTv.ligada);


    }
}
