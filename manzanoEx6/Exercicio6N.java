//n) Elaborar um programa que efetue a leitura de três valores inteiros
//            (representados pelas variáveis A, B e C) e apresente como resultado
//            final o valor do quadrado da soma dos três valores lidos.
      
package manzanoEx6;

import java.util.Scanner;

public class Exercicio6N {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero: ");
		int a = sc.nextInt(); 
		
		System.out.println("Escreva o segundo numero: ");
		int b = sc.nextInt(); 
		
		System.out.println("Escreva o terceiro numero: ");
		int c = sc.nextInt(); 

		
		
	    int soma = a + b + c;
	    int total = soma * soma;
	    
		System.out.println("O quadrado da soma dos tres valores é: "+ total);
		   
		 sc.close();
	}
}