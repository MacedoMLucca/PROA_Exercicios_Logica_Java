//k) Elaborar um programa que efetue a apresenta��o do valor da convers�o
//            em real (R$) de um valor lido em d�lar (US$). O programa dever�
//            solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
//            dispon�vel com o usu�rio. 

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
		
		System.out.print("A diferenca do maior pelo menor �: " + diferenca);
		
		sc.close();
		
	}
}