package br.ibm.com.treinamento.aulas.aula49;

public class FinallyPegadinha {
	public static void main(String[] args) {
		int[] numeros = {4, 8 , 16, 32, 64, 128};
		int[] demon = {2, 0 , 4, 8, 0 };

		for (int i=0; i<numeros.length;i++) {
			try {
				System.out.println(numeros[i]+"/" +demon[i] + "=" + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException e) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0);
				/*
				Essa linha termina a execucao do programa independente do que vem depois 
				 */

			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do array invalida");
				System.exit(0);
			}
			finally {
				System.out.println("Essa linha e impressa sempre apos o try ou catch");
				System.out.println();
			}


		}

	}

}
