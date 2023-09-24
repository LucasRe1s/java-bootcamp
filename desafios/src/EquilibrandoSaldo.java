import java.util.Locale;
import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            double saldoAtual = scanner.nextDouble();
            double valorDeposito = scanner.nextDouble();
            double valorRetirada = scanner.nextDouble();

            double saldoAtualizado = saldoAtt(saldoAtual, valorDeposito, valorRetirada);
            System.out.println("Saldo atualizado na conta: " + saldoAtualizado);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        scanner.close();


        /*
         * falta formatar os numeros
         * DecimalFormat formato = new DecimalFormat ("#.##");
         * saldoAtualizado = Double.valueOf (formato.format (saldoAtualizado));
         */

    }

    static double saldoAtt(double saldoAtual, double valorDeposito, double valorRetirada) {
        double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;
        return saldoAtualizado;
    }
}