//22) A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais
//            de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%.
//            Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva
//            o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas
//            (considere que o m�s possua 4 semanas exatas).


package faccat;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double Hextra = 0, htrab, ValHora, Salario, AcresH, SalFinal = 0;
		
		System.out.print("Digite quantas horas foram trabalhadas nesse mes: ");
		htrab = sc.nextDouble();
		Hextra = htrab-160;
		
		System.out.print("Digite o valor por hora trabalhada: ");
		ValHora= sc.nextDouble();
		Salario = 160*ValHora;
	    AcresH = ValHora * 50/100;
	    
	    
	    if (Hextra > 0) {
	        SalFinal = Salario+(Hextra*(AcresH+ValHora));
	        System.out.println("O salario este mes sera de: R$"+SalFinal);
	    } else {
	    	System.out.println("O salario este mes sera de: R$"+SalFinal);
	    }
	    
		sc.close();
	}
}
