//41) Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
//exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
//e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
//								N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios
//Média_de_Aproveitamento = ---------------------------------------------------------
//												7 
package faccat;

import java.util.Scanner;

public class Exercicio41 {
	
	public static void main(String args[]) {

		float PAvaliacao,SAvaliacao,TAvaliacao,Rec,media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira avaliação: ");
		PAvaliacao = sc.nextFloat();
		
		System.out.println("Digite o valor da segunda avaliação: ");
		SAvaliacao = sc.nextFloat();
		
		System.out.println("Digite o valor da terceira avaliação: ");
		TAvaliacao = sc.nextFloat();
		
		System.out.println("Digite a media de exxercicios: ");
		Rec = sc.nextFloat();
		
		media = (PAvaliacao + (SAvaliacao*2) + (TAvaliacao*3) + Rec) / 7;
		
		if(media >= 9) {
			System.out.println("Este aluno ficou com nota: "+media+" e Conceito A");
			
		}else if(media >= 7.5 && media < 9) {
			System.out.println("Este aluno ficou com nota: "+media+" e Conceito B");
			
		}else if(media >= 6.0 && media < 7.5) {
			System.out.println("Este aluno ficou com nota: "+media+" e Conceito C");
			
		}else if(media < 6) {
			System.out.println("Este aluno ficou com nota: "+media+" e Conceito D");
		}
		
		sc.close();
	}

}
