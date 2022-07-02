//L) Elaborar um programa que efetue a apresentação do valor da conversão
//            em dólar (US$) de um valor lido em real (R$). O programa deverá
//            solicitar o valor da cotação do dólar e também a quantidade de reais
//            disponível com o usuário.

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6L {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor que voce possue em reais: ");
	double real = sc.nextDouble(); 
	
	System.out.println("Digite a cotação atual: ");
	double cotacao = sc.nextDouble();
	
	double resul = real / cotacao;

	System.out.println("Em reias voce teria aproximadamente: " + resul + " dolares");
	   
	 sc.close();
		
	}
}