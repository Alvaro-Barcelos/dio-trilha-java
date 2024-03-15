package edu.alvaro.metodos;

public class Usuario {
	public static void main(String[] args) {
		SmartTV smartTv = new SmartTV();
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		
		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Canal Atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
		smartTv.mudarCanal(37);
		System.out.println("Novo status - Canal Atual: " + smartTv.canal);
		
		smartTv.ligar();
		System.out.println("Novo status - TV Ligada? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status - TV Ligada? " + smartTv.ligada);
	}
	
}
