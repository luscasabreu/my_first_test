package aplication;
import java.util.Locale;
import java.util.Scanner;
import entidades.Conta;


public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner x = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Digite o número da sua conta: ");
			int numeroConta = x.nextInt();
			x.nextLine();
		System.out.println("Digite o nome do titular: ");
			String titular = x.nextLine();
		System.out.println("Deseja fazer um depósito inicial? ");
			char resposta = x.next().charAt(0);
		
		/* Começo da estrutura condicional */
		if(resposta=='s') {
			System.out.println("Digite o valor do depósito inicial: ");
			double depositoInicial = x.nextDouble();
			conta = new Conta(numeroConta, titular, depositoInicial);
		} else {
			conta = new Conta(numeroConta, titular);
		}
		/* Fim da estrutura condicional */
		
		System.out.println();
		System.out.println("Conta:");
		System.out.println(conta);
		
		/*Depósito*/
		System.out.println();
		System.out.println("Digite o valor do depósito: ");
		double valorDeposito = x.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Conta atualizada: ");
		System.out.println(conta);
		
		/*Saque*/
		System.out.println();
		System.out.println("Digite o valor do saque: ");
		double valorSaque = x.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Conta atualizada: ");
		System.out.println(conta);					
		
		x.close();
		
	}

}

