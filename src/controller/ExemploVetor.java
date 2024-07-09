package controller;

import util.Teclado;

public class ExemploVetor {

	public static void main(String[] args) {
		
		//declaração do vetor
		int b[] = new int[8];
		int c[] = new int[8];
		int cont = 0;
		
		while ( cont < 8 ) {
			b[cont] = Teclado.lerInt("Número ?");
			c[cont] = b[cont] * 2;
			cont ++ ;
		}
		
		cont = 0;
		while ( cont < 8 ) {
			System.out.print(b[cont] + " x 2 = " + c[cont] + " \n");
			cont ++ ;
		}
	}
}
