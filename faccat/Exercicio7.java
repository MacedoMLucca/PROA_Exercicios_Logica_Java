//7) Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e m�s com 30 dias. 

package faccat;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos anos voc� tem?");
		int ano = sc.nextInt();
		int resultAno = ano*365;
		
		System.out.println("Quantos meses se passaram do seu aniversario(caso n�o tenha passado 1 m�s digite 0)");
		int mes = sc.nextInt();
		int resultMes = mes*30;
		
		System.out.println("Quantos dias se passaram do seu 'm�sversario'");
		int dia = sc.nextInt();
		
	    int resultado = dia + resultAno + resultMes;	
		
		System.out.println("Voc� tem "+resultado+" dias de vida");
		sc.close();
	}
}
