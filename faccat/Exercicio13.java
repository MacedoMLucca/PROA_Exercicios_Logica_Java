//13) Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia final deste aluno.
//Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5. F�rmula para o c�lculo da m�dia
//final �:
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
		
		System.out.println("Sua media � de "+mf);
		sc.close();
	}
}
