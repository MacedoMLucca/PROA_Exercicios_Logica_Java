//m) Elaborar um programa que efetue a leitura de tr�s valores inteiros
//            (representados pelas vari�veis A, Be C) e apresente como resultado
//            final o valor da soma dos quadrados dos tr�s valores lidos.
        
package manzanoEx6;

import java.util.Scanner;

public class Exercicio6M {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escreva o primeiro numero: ");
	int a = sc.nextInt(); 
	
	System.out.println("Escreva o segundo numero: ");
	int b = sc.nextInt(); 
	
	System.out.println("Escreva o terceiro numero: ");
	int c = sc.nextInt(); 

	
	a = a * a;
    b = b * b;
    c = c * c;
    int soma = a + b + c;
    
	System.out.println("A soma dos quadrados dos numeros inseredo �: "+ soma);
	   
	 sc.close();	
	}
}