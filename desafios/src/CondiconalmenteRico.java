import java.util.Scanner;

public class CondiconalmenteRico {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        scanner.close();
        sacar(saldoTotal, valorSaque);
        calcularSaldoAtualizado(saldoTotal, valorSaque);
    }

    static void sacar(int saldoTotal, int valorSaque) {

        if (saldoTotal >= valorSaque) {
            saldoTotal = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoTotal);
        } else {

            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
    }

// esse codigo fnciona o meu não
private static void calcularSaldoAtualizado(int saldoTotal, int valorSaque) {
    if (saldoTotal > valorSaque) {
        saldoTotal = saldoTotal - valorSaque;
        System.out.print("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
    } else {
        System.out.println("Saldo insuficiente. Saque nao realizado!");
    }
}

}
