//) Seja o seguinte algoritmo: 
package faccat;

import java.util.Scanner;

public class Exercicio43 {
	
	public static void main(String[] args) {
	
		int a,b,c;
		String mens;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a descri��o do produto (Nome): ");
		a = sc.nextInt();	
		
		System.out.println("Informe a descri��o do produto (Nome): ");
		b = sc.nextInt();	
		
		System.out.println("Informe a descri��o do produto (Nome): ");
		c = sc.nextInt();	
		
		
	    if ((a < b+c) && (b < a+c) && (c <a+b) ) {
	        if ((a==b) && (b==c)) {
	            mens = "Tri�ngulo Equil�tero";
	            System.out.println(mens);
	        } else if ((a==b) || (b==c) || (a==c)) {
	            mens = "Tri�ngulo Is�sceles";
	            System.out.println(mens);
	        } else {
	            mens = "Tri�ngulo Escaleno";
	            System.out.println(mens);
	        }
	    } else{
	        mens = "N�o e poss�vel formar um tri�ngulo";
	        System.out.println(mens);
	    } 

		sc.close();	
		
	}
}
