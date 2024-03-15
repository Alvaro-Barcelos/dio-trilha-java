package projetos.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long numero;
		String agencia;
		String cliente;
		double saldo;
		
		System.out.println("Digite o nome do titular da conta ");
		System.out.print("=> ");
		cliente = input.nextLine();
		
		System.out.println("Digite o numero da conta ");
		System.out.print("=> ");
		numero = input.nextLong();
		input.nextLine();
		
		System.out.println("Digite a agencia (067-8)");
		System.out.print("=> ");
		agencia = input.nextLine();
		
		System.out.println("Digite o saldo em conta ");
		System.out.print("=> ");
		saldo = input.nextDouble();
		
		
		System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é "+ agencia +", conta "+numero +" e seu saldo "+saldo+" "
				+ "já está disponível para saque");
		
		input.close();
	}
	
}
