//41) Fa�a um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verifica��es e a m�dia dos
//exerc�cios que fazem parte da avalia��o. Calcular a m�dia de aproveitamento, usando a f�rmula abaixo
//e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
//								N1 + N2 * 2 + N3 * 3 + M�dia_dos_Exerc�cios
//M�dia_de_Aproveitamento = ---------------------------------------------------------
//												7 
package faccat;

import java.util.Scanner;

public class Exercicio41 {
	
	public static void main(String args[]) {

		float PAvaliacao,SAvaliacao,TAvaliacao,Rec,media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira avalia��o: ");
		PAvaliacao = sc.nextFloat();
		
		System.out.println("Digite o valor da segunda avalia��o: ");
		SAvaliacao = sc.nextFloat();
		
		System.out.println("Digite o valor da terceira avalia��o: ");
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
