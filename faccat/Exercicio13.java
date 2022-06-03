//13) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
//Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
//final é:
//                  n1 * 2a + n2 * 3 + n3 * 5
//mediafinal = -----------------------------------
//                           10

package faccat;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A primeira nota:");
		float numUM = sc.nextFloat();
		
		System.out.println("A segunda nota:");
		float numDOIS = sc.nextFloat();
		
		System.out.println("A terceira nota:");
		float numTRES = sc.nextFloat();
		
		
		float mf = ((numUM*2)+(numDOIS*3)+(numTRES*5))/10;
		
		System.out.println("Sua media é de "+mf);
		sc.close();
	}
}
