//20) Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrev�-los em ordem crescente.

package faccat;

import java.util.Scanner;

public class Exercicio20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int num2 = sc.nextInt();
		
		
		if (num1 > num2) {
			System.out.println("A ordem � "+num2+" , "+ num1);
		}else {
			System.out.println("A ordem � "+num1+" , "+ num2);
		}
		sc.close();
	}
}
