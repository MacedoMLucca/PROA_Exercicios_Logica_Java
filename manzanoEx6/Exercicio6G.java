//g) Ler quatro valores num�ricos inteiros e apresentar o resultado das
//            adi��es e das multiplica��es utilizando-se o conceito de propriedade
//            distributiva para a m�xima-combina��o poss�vel entre as quatro
//            dever� ser combinada a vari�vel A com a vari�vel B, a vari�vel A com
//            a vari�vel C, a vari�vel A com a vari�vel D. Depois ser� necess�rio
//            combinar a vari�vel B com a vari�vel C e a vari�vel B com a vari�vel
//            De por fim a vari�vel C ser� combinada com a vari�vel D.
       
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

	  System.out.println("Adi��o \n"+
	   "A soma entre "+ A+ " + "+ B+ " �: "+ SOMAAB +"\n"+
	   "A soma entre"+ A+ "+"+ C+ " �: "+ SOMAAC +"\n"+
	   "A soma entre"+ A+ "+"+ D+ " �: "+ SOMAAD +"\n"+
	   "A soma entre"+ B+ "+"+ C+ " �: "+ SOMABC +"\n"+
	   "A soma entre"+ B+ "+"+ D+ " �: "+ SOMABD +"\n"+
	   "A soma entre"+ C+ "+"+ D+ " �: "+ SOMADC + "\n" 
	  );

	  System.out.println(" e a Multiplica��o \n"+
	   "A Multiplica��o entre"+ A+ "+"+ B+ " �: "+ PRODUTOAB +"\n"+
	   "A Multiplica��o entre"+ A+ "+"+ C+ " �: "+ PRODUTOAC +"\n"+
	   "A Multiplica��o entre"+ A+ "+"+ D+ " �: "+ PRODUTOAD +"\n"+
	   "A Multiplica��o entre"+ B+ "+"+ C+ " �: "+ PRODUTOBC +"\n"+
	   "A Multiplica��o entre"+ B+ "+"+ D+ " �: "+ PRODUTOBD +"\n"+
	   "A Multiplica��o entre"+ C+ "+"+ D+ " �: "+ PRODUTODC + "\n" 
	  );


	
	 sc.close();
		
	}
}

