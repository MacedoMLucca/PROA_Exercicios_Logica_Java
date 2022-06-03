//16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
//compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
//escreva o custo total da compra. 

package faccat;

import java.util.Scanner;

public class Exercicio16 {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Digite o numero de maças que comprou: ");
			int QtdMaca = sc.nextInt();
			
			
			if (QtdMaca<12) {
				float ValFinal = (QtdMaca*130)/100;
				System.out.println("O valor total é de "+ValFinal+" reais");
			} else {
				float ValFinal = QtdMaca*1;
			 System.out.println("O valor total é de "+ValFinal+" reais");
			}
			sc.close();
	}
}
