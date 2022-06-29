/*30) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
crescente.  */

package faccat;

import java.util.Scanner;

public class Exercicio30 {
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor: ");
		int valUm = sc.nextInt();
		
		System.out.println("Digite o 2° valor: ");
		int valDois = sc.nextInt();
		
		System.out.println("Digite o 3° valor: ");
		int valTres = sc.nextInt();
		
		if(valUm > valDois && valDois > valTres) {
			System.out.println("A ordem crescente é: " + valTres + " , " + valDois + " , " + valUm);
		}
		
		if(valUm > valTres && valTres > valDois) {
			System.out.println("A ordem crescente é: " + valDois + " , " + valTres + " , " + valUm);
		}
		
		if(valDois > valUm && valUm > valTres) {
			System.out.println("A ordem crescente é: " + valTres + " , " + valUm + " , " + valDois);
		}
		
		if(valDois > valTres && valTres > valUm) {
			System.out.println("A ordem crescente é: " + valUm + " , " + valTres + " , " + valDois);
		}
		
		if(valTres > valUm && valUm > valDois) {
			System.out.println("A ordem crescente é: " + valDois + " , " + valUm + " , " + valTres);
		}
		
		if(valTres > valDois && valDois > valUm) {
			System.out.println("A ordem crescente é: " + valUm + " , " + valDois + " , " + valTres);
		}
		sc.close();
	}

}
