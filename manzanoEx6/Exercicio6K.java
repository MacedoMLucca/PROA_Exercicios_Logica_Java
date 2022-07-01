//k) Elaborar um programa que efetue a apresentação do valor da conversão
//            em real (R$) de um valor lido em dólar (US$). O programa deverá
//            solicitar o valor da cotação do dólar e também a quantidade de dólares
//            disponível com o usuário. 

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6K {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor que voce possue em dolares: ");
	double dolar = sc.nextDouble(); 
	
	System.out.println("Digite a cotação atual: ");
	double cotacao = sc.nextDouble();
	
	double resul = dolar * cotacao;

	System.out.println("Em reias voce teria aproximadamente: " + resul + " reais");
	   
	 sc.close();
		
	}
}

