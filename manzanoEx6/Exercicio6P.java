//k) Elaborar um programa que efetue a apresenta��o do valor da convers�o
//            em real (R$) de um valor lido em d�lar (US$). O programa dever�
//            solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
//            dispon�vel com o usu�rio. 

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
		
		System.out.print("O novo salario ser�: R$"+ NS);
		
		sc.close();
		
	}
}