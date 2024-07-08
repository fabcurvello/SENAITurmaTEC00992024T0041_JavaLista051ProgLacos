package lista051;

public class Questao04 {

	/*
	 * 4) Desenvolver um programa que apresente o valor da soma dos cem primeiros
	 * números inteiros (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100)
	 */

	public static void main(String[] args) {
		
		int cont = 1, soma = 0;// soma é var acumulador
		
		while ( cont <= 100 ) {
			soma = soma + cont;
			cont++ ; // é a mesma coisa que cont = cont + 1;
		}//fim do while
		
		System.out.println("A soma dos cem primeiros números é " + soma);
	}
}
