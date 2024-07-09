package lista051;

import util.Teclado;

public class Questao06 {

	/*
	 * 6) Desenvolver um programa que leia um número n qualquer menor ou igual a 50
	 * e apresente o valor obtido da multiplicação sucessiva de n por 3 enquanto o
	 * produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).
	 */

	public static void main(String[] args) {
		
		int n;
		
		n = Teclado.lerInt("Informe um número menor ou igual a 50:");
		if ( n <= 50 ) {
			while ( n < 250 ) {
				System.out.println(n);
				n = n * 3;
			}// fim do while
		} else {
			System.out.println("ERRO! Valor inserido é maior que 50");
		}
	}
}
