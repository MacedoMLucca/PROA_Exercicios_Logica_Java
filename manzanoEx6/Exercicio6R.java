//k) Elaborar um programa que efetue a apresentação do valor da conversão
//            em real (R$) de um valor lido em dólar (US$). O programa deverá
//            solicitar o valor da cotação do dólar e também a quantidade de dólares
//            disponível com o usuário. 

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6R {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, diferenca;
		
		System.out.println("Digite um valor: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor2 = sc.nextInt();
		
		if(valor1 > valor2) {
			diferenca = valor1 - valor2;
		}else {
			diferenca = valor2 - valor1;
		}
		
		System.out.print("A diferenca do maior pelo menor é: " + diferenca);
		
		sc.close();
		
	}
}