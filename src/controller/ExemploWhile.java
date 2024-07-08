package controller;

import util.Teclado;

public class ExemploWhile {

	/*
	 * Algoritmo para pedir a leitura de um valor para a variável x, multiplicar
	 * este valor por 3, colocar o valor obtido na variável r, e apresentar o valor
	 * de r, repetindo a sequência cinco vezes.
	 */

	public static void main(String[] args) {
		
		int x, r, cont;
		
		cont = 10;
		
		while ( cont <= 5 ) {
			x = Teclado.lerInt("Informe um número :");
			r = x * 3;
			System.out.printf("%d * 3 = %d \n", x, r);
			cont = cont + 1;
		}//fim do while

	}

}







