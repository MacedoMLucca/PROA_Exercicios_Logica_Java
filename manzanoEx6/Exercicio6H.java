// h) Elaborar um programa que calcule e apresente o volume de uma caixa
//            retangular, por meio da fórmula:
//            VOLUME <- COMPRIMENTO * LARGURA * ALTURA.
package manzanoEx6;

import java.util.Scanner;

public class Exercicio6H {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("O valor do comprimento: ");
	double comprimento = sc.nextDouble(); 
	
	System.out.println("O valor de largura: ");
	double largura = sc.nextDouble();
	
	
	System.out.println("O valor de altura: ");
	double altura = sc.nextDouble();

	    
	double volume = comprimento * largura *altura;

	System.out.println("A caixa tem "  + volume + " metros cubicos de volume");
	   
	 sc.close();
		
	}
}

