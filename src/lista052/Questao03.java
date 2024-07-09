package lista052;

public class Questao03 {

	/*
	 * 3) Desenvolver um programa que apresente o total da soma dos cinco primeiros
	 * números inteiros.
	 */

	public static void main(String[] args) {
		
		int cont = 1, soma = 0;
		
		do {
			soma += cont;  //é o mesmo que soma = soma + cont;
			cont++;
		} while ( cont <= 5 );
		
		System.out.println("A soma dos valores de 1 a 5 é " + soma);

	}

}
