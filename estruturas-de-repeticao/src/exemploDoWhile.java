import java.util.Random;


public class exemploDoWhile {
    
    public static void main(String[] args) {
         
    }

    private static boolean tocando(){
        boolean atendeu = new Random(0).nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;
    }
}


