package manzanoloops.loopsDoWhile;

import java.util.Scanner;

public class ExercicioE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadora = 1, soma = 0;

		do {
			System.out.println("Digite um numero: ");
			int numero = sc.nextInt();
			soma = numero + soma;
			contadora = contadora + 1;
		} while (contadora < 15);
		System.out.println(soma);
		sc.close();
	}
}
