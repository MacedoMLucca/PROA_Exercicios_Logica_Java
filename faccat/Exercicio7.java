//7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 

package faccat;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		int ano = sc.nextInt();
		int resultAno = ano*365;
		
		System.out.println("Quantos meses se passaram do seu aniversario(caso não tenha passado 1 mês digite 0)");
		int mes = sc.nextInt();
		int resultMes = mes*30;
		
		System.out.println("Quantos dias se passaram do seu 'mêsversario'");
		int dia = sc.nextInt();
		
	    int resultado = dia + resultAno + resultMes;	
		
		System.out.println("Você tem "+resultado+" dias de vida");
		sc.close();
	}
}
