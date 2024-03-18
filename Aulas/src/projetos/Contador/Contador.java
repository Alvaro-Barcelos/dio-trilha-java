package projetos.Contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = input.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = input.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Parametro um maior que parametro dois");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int cont = 1;
		
		//realizar o for para imprimir os números com base na variável contagem
		for (int contagem = 0; contagem < parametroDois - parametroUm; contagem++) {
	        System.out.println("Imprimindo o numero " + cont);
	        cont++;
	    }
	}
}