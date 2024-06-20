import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
        
        System.out.println("digite seu numero: ");
        int num = scan.nextInt();
		scan.nextLine();
		System.out.println("digite sua agencia: ");
        String agencia = scan.nextLine();
		System.out.println("digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("digite seu saldo: ");
        double saldo = scan.nextDouble();
		

		ContaBancaria conta = new ContaBancaria(num, agencia, nome, saldo);

		conta.contaCriada();
		scan.close();
	}

}
