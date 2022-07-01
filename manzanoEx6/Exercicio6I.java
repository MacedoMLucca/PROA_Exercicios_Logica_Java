//i) Efetuar a leitura de um número inteiro e apresentar o resultado do
//            quadrado desse número.


package manzanoEx6;

import java.util.Scanner;

public class Exercicio6I {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o numero desejado: ");
	int num = sc.nextInt(); 
	
	double resul = Math.pow(num,2);

	System.out.println("O numero " + num + " ao quadrado é "+  resul);
	   
	 sc.close();
		
	}
}

