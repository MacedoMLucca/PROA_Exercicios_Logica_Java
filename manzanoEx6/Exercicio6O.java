//k) Elaborar um programa que efetue a apresentação do valor da conversão
//            em real (R$) de um valor lido em dólar (US$). O programa deverá
//            solicitar o valor da cotação do dólar e também a quantidade de dólares
//            disponível com o usuário. 

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
		
		System.out.println("O produto de " + a + " com " + c + " é: " + produto);
		System.out.println("A soma de " + b + " com " + d + " é: " + soma);
		
		
		sc.close();
		
	}
}