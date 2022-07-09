package manzanoloops.loopsWhile;

import java.util.Scanner;

public class ExercicioF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base,expoente, i = 1;
	
		System.out.println("Por favor digite o valor da base: ");
		base = sc.nextInt();
		
		System.out.println("Por favor digite o valor do expoente: ");
		expoente = sc.nextInt();
		
		int baseAUX = base;
		
		
		while(i < expoente) {
			
			baseAUX = baseAUX * base;
			i++;
			
		}
		
		System.out.println(base+"^"+expoente+"="+baseAUX);
		sc.close();
	}
}
