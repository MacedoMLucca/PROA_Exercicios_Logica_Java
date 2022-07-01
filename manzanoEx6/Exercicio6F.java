//f) Ler dois valores para as variáveis A e B, e efetuar a troca dos valores
//            de forma que a variável A passe a possuir o valor da variável B e a
//            variável B passe a possuir o valor da variável A. Apresentar os valores
//            trocados.

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6F {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	   int C;
	   
	   System.out.println("O valor de A: ");
	   int A = sc.nextInt();
	   
	   System.out.println("O valor de B: ");
	   int B = sc.nextInt();
	
	   C = A;
	   A = B;
	   B = C;

   	System.out.println("O valor de A passa ser " + A + " e o valor de B passa a ser "+ B);

	 sc.close();
		
	}
}

