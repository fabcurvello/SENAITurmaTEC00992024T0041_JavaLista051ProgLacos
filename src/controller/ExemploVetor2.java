package controller;

import util.Teclado;

public class ExemploVetor2 {

	public static void main(String[] args) {
		
		String vet[] = new String[5];
		
		for ( int cont = 0 ; cont < 5 ; cont ++ ) {
			vet[cont] = Teclado.lerTexto("Nome?");
		}

		for ( int cont = 0 ; cont < 5 ; cont ++ ) {
			System.out.println((cont+1) + " - " + vet[cont]);
		}
		
	}

}
