//j) Ler dois valores inteiros (vari�veis A e B) e apresentar o resultado do
//            quadrado da diferen�a do primeiro valor (vari�vel A) pelo segundo valor
//            (vari�vel B).

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6J {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("O valor do comprimento: ");
	int a = sc.nextInt(); 
	
	System.out.println("O valor do comprimento: ");
	int b = sc.nextInt(); 

	int dif = a - b;
	double resul = Math.pow(dif,2);
	
	System.out.println("O quadrado da difere��o entre " + a + " e "+ b +" �: " + resul);
	   
	 sc.close();
		
	}
}


