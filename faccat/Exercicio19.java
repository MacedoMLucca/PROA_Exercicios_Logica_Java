//19) Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrever o maior deles. 

package faccat;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o primeiro valor: ");
		int num2 = sc.nextInt();
		
		 if (num1 > num2) {
		     System.out.print("O maior numero �: "+num1);    
		 } else {
			 System.out.print("O maior numero �: "+num2);
		 }
		
		sc.close();
	}
}
