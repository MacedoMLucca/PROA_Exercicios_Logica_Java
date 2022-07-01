//e) Efetuar o cálculo e a apresentação do valor de uma prestação em
//	            atraso, utilizando a fórmula: PRESTAÇÃO + VALOR + (VALOR
//	            (TAXA/100) * TEMPO).

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6E {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

		System.out.println("O valor da Parcela: ");
	    double valor = sc.nextDouble(); 
	    
	    System.out.println("Digite a taxa de Juros: ");
	    double taxa = sc.nextDouble();
	    
	    System.out.println("Digite a duração dessa prestação: ");
	    double duracao = sc.nextDouble();

	    double prestacao = valor + (valor*(taxa/100)*duracao);

	    		
 	   System.out.println("O valor da prestação sera de: "+prestacao);
	 
	 sc.close();
		
	}
}

