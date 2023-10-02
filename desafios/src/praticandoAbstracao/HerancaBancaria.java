package praticandoAbstracao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HerancaBancaria {

  public static void main(String[] args) {

    try (

        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);) {

      String titular = scanner.nextLine();
      int numeroConta = scanner.nextInt();
      double saldo = scanner.nextDouble();

      // criar um metodo
      double taxaJuros = 0.0;
      boolean inputValido = false;
      while (!inputValido) {
        try {
          System.out.println("Por favor, digite a taxa de juros: ");
          taxaJuros = scanner.nextDouble();
          inputValido = true;
        } catch (java.util.InputMismatchException e) {
          System.out.println("Entrada inválida. Por favor, insira um número válido.");
          scanner.nextLine();
        }
      }
      ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

      System.out.println("Conta Poupanca:");
      contaPoupanca.exibirInformacoes();

      scanner.close();
    }
  }

}

class ContaBancaria {
  protected int numero;
  protected String titular;
  protected double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public void exibirInformacoes() {
    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    System.out.println(titular);
    System.out.println(numero);
    System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
  }
}

class ContaPoupanca extends ContaBancaria {
  private double taxaJuros;
  DecimalFormat decimalFormat = new DecimalFormat("#.0");

  public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
    // TODO: Implementar adequadamente esta sobrecarga de construtores.
    super(numero, titular, saldo);
    this.taxaJuros = taxaJuros;
  }

  public void exibirInformacoes() {
    super.exibirInformacoes();
    // TODO: Complementar as informações com a taxa de juros.
    System.out.println("Taxa de juros: " + decimalFormat.format(this.taxaJuros) + "%");
  }
}