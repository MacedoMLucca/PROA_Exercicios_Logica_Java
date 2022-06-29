package faccat;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int hInicio = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int hFinal = sc.nextInt();
		
		int duracao = hFinal - hInicio;
		int duracao1;
		
		if (duracao > 0) {
			System.out.println("A partidad durou "+duracao+" horas");
		} else {
			duracao1 = duracao + 24;
			System.out.println("A partidad durou "+duracao1+" horas");
		}
		
		
		
		sc.close();

	}

}
