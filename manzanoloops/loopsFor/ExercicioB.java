package manzanoloops.loopsFor;

import java.util.Scanner;

public class ExercicioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Você quer ver a tabuada de qual numero ? ");
		int numero = sc.nextInt();

		for (int contadora = 1; contadora <= 10; contadora++) {
			System.out.println(numero + " x " + contadora + " = " + numero * contadora);
		}
		sc.close();
	}
}
