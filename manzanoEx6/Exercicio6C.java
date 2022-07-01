//c) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando
//            a fórmula: VOLUME = 3.14159 * R ^ 2 * ALTURA.
package manzanoEx6;

import java.util.Scanner;

public class Exercicio6C {

	public static void main(String[] args) {
	 
		 Scanner sc =new Scanner(System.in);
		 
		 
		 System.out.println("Escreva a altura da sua lata de oleo: ");
		 double altura = sc.nextDouble();
		 
		 System.out.println("Escreva a diâmetro da sua lata de oleo:  ");
	     double Diametro = sc.nextDouble();
	     
	     double r = Diametro/2;
		 double volume = 3.14159*(Math.pow(r,2))*altura;

		 
		 System.out.println("O avolume da sua lata é: " + volume);

		 
		 sc.close();
	}

}
