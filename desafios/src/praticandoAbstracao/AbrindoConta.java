package praticandoAbstracao;

import java.util.Scanner;

public class AbrindoConta {

  public static void main(String[] args) {
       try (
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);)

    {

      
      int numeroConta = scanner.nextInt();

      scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

      
      String nomeTitular = scanner.nextLine();

      

      double saldo = scanner.nextDouble();

      // TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
      ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

      System.out.println("Informacoes:");
      // TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
      conta.exibirInformacoes();

    }
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
  
  public void exibirInformacoes(){
    System.out.println("Conta: " + numero);
    System.out.println("Titular: " + titular);
    System.out.println("Saldo: R$ " + saldo);
  }
}