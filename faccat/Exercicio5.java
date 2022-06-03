
//5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor

package faccat;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Digite um numero:");
		int num =  sc.nextInt();
		
		int antecessor = num - 1;
		
		System.out.println("O antecessor de "+num+" é " + antecessor );

		sc.close();
	}

}
