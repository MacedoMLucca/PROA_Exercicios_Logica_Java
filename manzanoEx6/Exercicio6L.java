//L) Elaborar um programa que efetue a apresenta��o do valor da convers�o
//            em d�lar (US$) de um valor lido em real (R$). O programa dever�
//            solicitar o valor da cota��o do d�lar e tamb�m a quantidade de reais
//            dispon�vel com o usu�rio.

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6L {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor que voce possue em reais: ");
	double real = sc.nextDouble(); 
	
	System.out.println("Digite a cota��o atual: ");
	double cotacao = sc.nextDouble();
	
	double resul = real / cotacao;

	System.out.println("Em reias voce teria aproximadamente: " + resul + " dolares");
	   
	 sc.close();
		
	}
}