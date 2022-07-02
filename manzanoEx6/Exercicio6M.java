//m) Elaborar um programa que efetue a leitura de três valores inteiros
//            (representados pelas variáveis A, Be C) e apresente como resultado
//            final o valor da soma dos quadrados dos três valores lidos.
        
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
    
	System.out.println("A soma dos quadrados dos numeros inseredo é: "+ soma);
	   
	 sc.close();	
	}
}