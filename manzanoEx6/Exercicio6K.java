//k) Elaborar um programa que efetue a apresenta��o do valor da convers�o
//            em real (R$) de um valor lido em d�lar (US$). O programa dever�
//            solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
//            dispon�vel com o usu�rio. 

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6K {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor que voce possue em dolares: ");
	double dolar = sc.nextDouble(); 
	
	System.out.println("Digite a cota��o atual: ");
	double cotacao = sc.nextDouble();
	
	double resul = dolar * cotacao;

	System.out.println("Em reias voce teria aproximadamente: " + resul + " reais");
	   
	 sc.close();
		
	}
}

