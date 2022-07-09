package manzanoloops.loopsDoWhile;

import java.util.Scanner;

public class ExercicioF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0, contadora = 0, soma = 0;
		double media = 0.00;
		do {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();

			if (numero >= 0) {
				soma = numero + soma;
				contadora = contadora + 1;
				media = soma / contadora;
			}

		} while (numero > 0);

		System.out.println("A soma de todos os numeros é " + soma);
		System.out.println("A quantidade de numeros digitados foi de " + contadora);
		System.out.println("A media dos numeros foi de " + media);
		sc.close();
	}
}
