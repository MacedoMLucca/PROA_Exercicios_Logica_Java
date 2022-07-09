package manzanoloops.loopsDoWhile;

import java.util.Scanner;

public class ExercicioI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0, menor = 9999, n = 1;

		System.out.println("Digite um numero inteiro positivo ou um negativo para encerra a contagem");

		do {
			System.out.println("Digite o numero: ");
			n = sc.nextInt();
			if (n > maior) {
				maior = n;
			}
			if (n < menor) {
				menor = n;
			}
		} while (n > 0);
		System.out.println("O maior numero digitado foi: " + maior);
		System.out.println("O menor numero digitado foi: " + menor);
		sc.close();
	}
}
