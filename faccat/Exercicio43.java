//) Seja o seguinte algoritmo: 
package faccat;

import java.util.Scanner;

public class Exercicio43 {
	
	public static void main(String[] args) {
	
		int a,b,c;
		String mens;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a descrição do produto (Nome): ");
		a = sc.nextInt();	
		
		System.out.println("Informe a descrição do produto (Nome): ");
		b = sc.nextInt();	
		
		System.out.println("Informe a descrição do produto (Nome): ");
		c = sc.nextInt();	
		
		
	    if ((a < b+c) && (b < a+c) && (c <a+b) ) {
	        if ((a==b) && (b==c)) {
	            mens = "Triângulo Equilátero";
	            System.out.println(mens);
	        } else if ((a==b) || (b==c) || (a==c)) {
	            mens = "Triângulo Isósceles";
	            System.out.println(mens);
	        } else {
	            mens = "Triângulo Escaleno";
	            System.out.println(mens);
	        }
	    } else{
	        mens = "Não e possível formar um triângulo";
	        System.out.println(mens);
	    } 

		sc.close();	
		
	}
}
