//14) Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso
//contr�rio escrever N�O � MAIOR QUE 10! 

package faccat;

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int valor = sc.nextInt();
			
		if (valor>10) {
			 	System.out.println("� MAIOR QUE 10!");
		} else {
				System.out.println("N�O � MAIOR QUE 10!");
		}
		sc.close();
	}
}
