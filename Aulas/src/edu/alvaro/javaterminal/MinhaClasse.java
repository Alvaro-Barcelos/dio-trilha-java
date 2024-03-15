package edu.alvaro.javaterminal;

import java.util.Scanner;

public class MinhaClasse {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num1, num2, PROD;
		
		System.out.print("Insira um numero: ");
		num1 = input.nextInt();
		System.out.print("Insira outro numero: ");
		num2 = input.nextInt();
		 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
		PROD =  num1 * num2;

		System.out.println("PROD = " +  PROD   );
    }
}
