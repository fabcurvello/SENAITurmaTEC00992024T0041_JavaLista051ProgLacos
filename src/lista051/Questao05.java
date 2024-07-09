package lista051;

import util.Teclado;

public class Questao05 {
	
	/*
	 * 5)	Desenvolver um programa que apresente os resultados de uma tabela de 
	 * um número qualquer. Ela deve ser impressa no seguinte formato: 
			Considerando como exemplo o fornecimento do número 2
			
			2 . 1 = 2
			2 . 2 = 4
			2 . 3 = 6
			2 . 4 = 8
			2 . 5 = 10
			(...)
			2 . 10 = 20
	 */

	public static void main(String[] args) {
		
		int cont, num;
		
		num = Teclado.lerInt("Informe um número:");
		
		cont = 1;
		while ( cont <= 10 ) {
			System.out.printf("%d . %d = %d \n", num, cont, num*cont);
			//System.out.println(num + " . " + cont + " = " + (num * cont));
			cont = cont + 1;
		}

	}

}
