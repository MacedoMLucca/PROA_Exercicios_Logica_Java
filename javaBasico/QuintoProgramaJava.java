package javaBasico;

import java.util.Scanner;

public class QuintoProgramaJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		System.out.println("Digite um numero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("O resultado da Subtração dos dois numeros é " + (numero-numero1) );
		sc.close();

	}

}
