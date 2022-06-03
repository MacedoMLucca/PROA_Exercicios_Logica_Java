//17) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
//aluno é aprovado). Escrever também a média calculada. 

package faccat;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float nota2 = sc.nextFloat();
		
		float md = (nota1 + nota2)/2;
		
		if (md >= 6) {
			System.out.print("Aluno aprovado com "+md+" de media");
		} else {
			System.out.print("Aluno reprovado com "+md+" de media");
		}
		sc.close();
	}
}
