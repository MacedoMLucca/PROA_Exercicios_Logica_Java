//6) Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a
//�rea do ret�ngulo. 

package faccat;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a base do retangulo: ");
		int base = sc.nextInt(); 
		
		System.out.println("digite a base do retangulo: ");
		int altura = sc.nextInt();
		
		int area = base * altura;
				
		System.out.println("A area do seu retangulo �: "+ area);
		sc.close();
	}
}
