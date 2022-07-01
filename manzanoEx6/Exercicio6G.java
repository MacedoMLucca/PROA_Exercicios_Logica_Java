//g) Ler quatro valores numéricos inteiros e apresentar o resultado das
//            adições e das multiplicações utilizando-se o conceito de propriedade
//            distributiva para a máxima-combinação possível entre as quatro
//            deverá ser combinada a variável A com a variável B, a variável A com
//            a variável C, a variável A com a variável D. Depois será necessário
//            combinar a variável B com a variável C e a variável B com a variável
//            De por fim a variável C será combinada com a variável D.
       
package manzanoEx6;

import java.util.Scanner;

public class Exercicio6G {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("O valor de A: ");
	int A = sc.nextInt();
		
	System.out.println("O valor de A: ");
	int B = sc.nextInt();
		
	System.out.println("O valor de A: ");
	int C = sc.nextInt();
	
	System.out.println("O valor de A: ");
	int D = sc.nextInt();
	 
	    
	  int SOMAAB = A + B;
	  int SOMAAC = A + C;
	  int SOMAAD = A + D;
	  int SOMABC = B + C;
	  int SOMABD = B + D;
	  int SOMADC = D + C;

	  int PRODUTOAB = A * B;
	  int PRODUTOAC = A * C;
	  int PRODUTOAD = A * D;
	  int PRODUTOBC = B * C;
	  int PRODUTOBD = B * D;
	  int PRODUTODC = D * C;

	  System.out.println("Adição \n"+
	   "A soma entre "+ A+ " + "+ B+ " é: "+ SOMAAB +"\n"+
	   "A soma entre"+ A+ "+"+ C+ " é: "+ SOMAAC +"\n"+
	   "A soma entre"+ A+ "+"+ D+ " é: "+ SOMAAD +"\n"+
	   "A soma entre"+ B+ "+"+ C+ " é: "+ SOMABC +"\n"+
	   "A soma entre"+ B+ "+"+ D+ " é: "+ SOMABD +"\n"+
	   "A soma entre"+ C+ "+"+ D+ " é: "+ SOMADC + "\n" 
	  );

	  System.out.println(" e a Multiplicação \n"+
	   "A Multiplicação entre"+ A+ "+"+ B+ " é: "+ PRODUTOAB +"\n"+
	   "A Multiplicação entre"+ A+ "+"+ C+ " é: "+ PRODUTOAC +"\n"+
	   "A Multiplicação entre"+ A+ "+"+ D+ " é: "+ PRODUTOAD +"\n"+
	   "A Multiplicação entre"+ B+ "+"+ C+ " é: "+ PRODUTOBC +"\n"+
	   "A Multiplicação entre"+ B+ "+"+ D+ " é: "+ PRODUTOBD +"\n"+
	   "A Multiplicação entre"+ C+ "+"+ D+ " é: "+ PRODUTODC + "\n" 
	  );


	
	 sc.close();
		
	}
}

