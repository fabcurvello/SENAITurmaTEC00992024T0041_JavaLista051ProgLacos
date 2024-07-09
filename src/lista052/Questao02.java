package lista052;

public class Questao02 {

	/*
	 * 2) Desenvolver um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 até 500. Utilize um laço que varie de 2 em 2.
	 */

	public static void main(String[] args) {

		int cont, soma;

		cont = 0; // de zero a 500
		soma = 0; // var acumulador

		do {
			soma = soma + cont;
			cont = cont + 2;
		} while (cont <= 500);
		
		System.out.println("A soma dos pares de 0 a 500 é " + soma);

	}

}
