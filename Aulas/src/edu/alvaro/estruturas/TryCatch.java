package edu.alvaro.estruturas;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		try {
			 //criando o objeto scanner
	        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	        
	        System.out.println("Digite seu nome");
	        String nome = scanner.next();
	        
	        System.out.println("Digite seu sobrenome");
	        String sobrenome = scanner.next();
	
	        System.out.println("Digite sua idade");
	        int idade = scanner.nextInt();
	        
	        System.out.println("Digite sua altura");
	        double altura = scanner.nextDouble();
	
	        
	        //imprimindo os dados obtidos pelo usuario
	        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
	        System.out.println("Tenho " + idade + " anos ");
	        System.out.println("Minha altura é " + altura + "cm ");
	        scanner.close();  
		}
		catch(InputMismatchException e ) {
			System.out.println("O campo idade e altura precisam ser numericos");
		}
	}
	
}
