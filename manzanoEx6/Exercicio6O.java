//k) Elaborar um programa que efetue a apresenta��o do valor da convers�o
//            em real (R$) de um valor lido em d�lar (US$). O programa dever�
//            solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
//            dispon�vel com o usu�rio. 

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6O {
	
	public static void main(String[] args) {
		
		int a, b, c, d, produto, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		c = sc.nextInt();
		
		System.out.println("Digite o quarto valor: ");
		d = sc.nextInt();
		
		produto = a * c;
		soma = b + d;
		
		System.out.println("O produto de " + a + " com " + c + " �: " + produto);
		System.out.println("A soma de " + b + " com " + d + " �: " + soma);
		
		
		sc.close();
		
	}
}