package edu.alvaro.estruturas;

import java.util.Scanner;

public class ExemploForArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] clientes = new String[3];
		
		
		for(int i = 0; i < clientes.length; i++) {
			System.out.println("Insira o nome do " + i + " cliente");
			clientes[i] = input.nextLine();
		}
		
		// ForEach
		for(String cliente : clientes) {
			System.out.println("Nome do cliente é " + cliente);
		}
	}
}
