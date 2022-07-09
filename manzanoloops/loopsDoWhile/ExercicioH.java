package manzanoloops.loopsDoWhile;

import java.util.Scanner;

public class ExercicioH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidade = 0;
		double total = 0.00;
		do{
			System.out.println("Você quer adicionar um comodo ? (1) para sim, (2) para não");
			quantidade = sc.nextInt();
		    if(quantidade == 1){
		    	System.out.println("Qual o nome do comodo ? ");
		    	String nome = sc.next();
		    	System.out.println("Qual o comprimento do comodo em metros ?");
		    	double comprimento = sc.nextDouble();
		    	System.out.println("Qual é a largura do comodo em metros ?");
		    	double largura = sc.nextDouble();
		        double area = largura*comprimento;
		        System.out.println("A área do/a "+nome+" é :"+area+"m²");
		        total = total+area;
		    }
		}while(quantidade != 2);
		
		System.out.println("O total da area da casa é:"+total+"m²");
		
		sc.close();
	}
}
