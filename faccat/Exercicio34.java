//34) Faça um teste de mesa e complete o quadro a seguir para os seguintes valores:
package faccat;

import java.util.Scanner;

public class Exercicio34 {
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("X");
		int x = sc.nextInt();
		
		System.out.println("Y");
		int y = sc.nextInt();
		
		int z;
		String resposta;
		
		z = (x*y)+5;
		
		if (z == 0) {
			resposta = "A";
		} else {
			if (z <= 100) {
				resposta = "B";
			} else {
				resposta = "C";
			}

		}
		System.out.println(z +" , "+ resposta);
			sc.close();	
	}
}
