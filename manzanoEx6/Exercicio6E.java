//e) Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em
//	            atraso, utilizando a f�rmula: PRESTA��O + VALOR + (VALOR
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
	    
	    System.out.println("Digite a dura��o dessa presta��o: ");
	    double duracao = sc.nextDouble();

	    double prestacao = valor + (valor*(taxa/100)*duracao);

	    		
 	   System.out.println("O valor da presta��o sera de: "+prestacao);
	 
	 sc.close();
		
	}
}

