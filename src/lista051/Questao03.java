package lista051;

public class Questao03 {

	/*
	 * 3) Desenvolver um programa que apresente os quadrados dos números inteiros de
	 * 15 a 200.
	 */

	public static void main(String[] args) {
		
		int cont = 15;
		
		while ( cont <= 200 ) {
			System.out.printf("%d elevado ao quadrado = %.0f \n", cont, Math.pow(cont, 2) );
			cont ++;
		}
	}
}








