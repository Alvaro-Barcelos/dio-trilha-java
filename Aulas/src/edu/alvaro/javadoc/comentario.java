package edu.alvaro.javadoc;

public class comentario {
	// Comentario de uma linha
	
	/*
	 * javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
	 * Esta linha não esta dando certo
	 * Comentario de varias linhas!
	 */
	
	   /**
	    * Estas duas estrelas são para metodos
	    */
	public void metodo() {
		
	}
	/*
	 * Este método foi elaborado as pressas
	 * por isso eu abrevei o nome das variáveis
	 * mas olha, ele tem a finalidade de somar ou  multiplicar
	 * dois números
	 */
	
	public int somaMultiplica (int n, int x, String m){
	    int r = 0; // r é igual ao resultado
	    if (m == "M"){ // M= multiplicação
	        r= n * x;
	    }else{
	        // se não soma mesmo
	        r = n + x;
	    }
	    return r;
	}
}
