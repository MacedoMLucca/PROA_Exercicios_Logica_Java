//k) Elaborar um programa que efetue a apresentação do valor da conversão
//            em real (R$) de um valor lido em dólar (US$). O programa deverá
//            solicitar o valor da cotação do dólar e também a quantidade de dólares
//            disponível com o usuário. 

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6P {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		float SM, PR, NS;
		
		System.out.println("Digite o salario mensal: ");
		SM = sc.nextFloat();
		
		System.out.println("Digite o percentual de reajuste ");
		PR = sc.nextFloat();
		PR = PR / 100;
		
		NS = SM + (SM * PR);
		
		System.out.print("O novo salario será: R$"+ NS);
		
		sc.close();
		
	}
}