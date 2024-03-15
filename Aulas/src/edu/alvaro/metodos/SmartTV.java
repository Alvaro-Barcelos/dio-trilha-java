package edu.alvaro.metodos;

public class SmartTV {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		this.volume++;
	}
	
	public void diminuirVolume() {
		this.volume--;
	}
	
	public void mudarCanal(int novoCanal) {
		this.canal = novoCanal;
	}
}
