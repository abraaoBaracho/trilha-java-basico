import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opcao");
            System.out.println("1 - Depositar\n2 - Sacar\n3 - Consultar Saldo\n0 - Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                   System.out.println("Informe o valor a ser depositado");
                   double depositado = scanner.nextDouble();
                   saldo += depositado;
                    System.out.printf("Saldo atual: %.1f%n \n",saldo);
                    break;
                case 2:
                System.out.println("Informe o valor a ser sacado");
                   double saque = scanner.nextDouble();
                   if (saldo - saque >= 0) {
                    saldo -= saque;
                    System.out.printf("Saldo atual: %.1f%n \n", saldo);
                   } else {
                    System.out.println("Saldo insuficiente.");
                   }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n \n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}