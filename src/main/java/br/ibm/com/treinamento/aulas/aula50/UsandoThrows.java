package br.ibm.com.treinamento.aulas.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um numero decimal");
		try {
			double num = leNumero();
			System.out.println("Voçê digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada invalida, verifique se o valor inserido contem . ou , 4");
			//e.printStackTrace();
			/* O printStackTrace e interressante ser  utilizado apenas para uso de log, 
			 * pois o mesmo mostra informações importantes, evitar usar quando estiver
			 * sendo utilizado pelo usuario não utilizar */
		}

	}
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
	
	

}
