package manzanoloops.loopsWhile;

import java.util.Scanner;

public class ExercicioI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadora = 1;
		double numero = 0.00, numeroaux = 0.00;
		
		while(contadora<=10){
		    System.out.println(contadora+"° Digite um numero: ");
		    numeroaux = sc.nextDouble();
		    numero = numero+numeroaux;
		    contadora = contadora+1;
		}
		
		System.out.println("A soma dos dez valores é "+numero);
		System.out.println("A media dos dez valores é "+ (numero/10));
		sc.close();
	}

}
