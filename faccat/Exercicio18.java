//18) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
//poder? ou n?o votar este ano (n?o ? necess?rio considerar o m?s em que a pessoa nasceu). 

package faccat;

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano que voc? nasceu: ");
		int AnoNasc = sc.nextInt();
		
		System.out.print("Digite o ano atual: ");
		int AnoAtual = sc.nextInt();
		
		int idade = AnoAtual - AnoNasc;
		
		if (idade >= 18) {
			System.out.print("Parabens, Voc? j? pode votar");
		} else {
			System.out.print("Que Pena!, Voc? ainda n?o pode votar");
		}
		sc.close();
	}
}
