package lista052;

public class Questao01 {

	/*
	 * 1) Desenvolver um programa que apresente todos os valores numéricos inteiros
	 * pares situados na faixa de 100 a 200.
	 */

	public static void main(String[] args) {
		
		int cont = 100;
		do {
			System.out.println( cont );
			cont = cont + 2;
		} while ( cont <= 200 );
	}
}
