package lista051;

public class Questao08 {

	/*
	 * 8) Desenvolver um programa que apresente todos os valores numéricos inteiros
	 * ímpares situados na faixa de 0 a 20. Para saber se o número é ímpar, será
	 * necessário verificar essa condição com o comando if. Sendo ímpar, mostre-o;
	 * não sendo, passe para o próximo passo.
	 */

	public static void main(String[] args) {

		int cont = 0;
		while ( cont <= 20 ) {
			if ( cont % 2 == 1 ) {
				System.out.println( cont );
			} // fim do if
			cont ++;
		} // fim do while

	}

}
