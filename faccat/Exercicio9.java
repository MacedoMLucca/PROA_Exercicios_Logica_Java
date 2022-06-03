//9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário. 

package faccat;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
	
	float salAtual, PorRaejuste,valRea, salFinal,valReajuste;
	
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escreva seu salario mensal");
	salAtual = sc.nextFloat();
	//System.out.println(salAtual);

	System.out.println("Escreva somente o numero da procentagem de reajuste: ");
	PorRaejuste = sc.nextFloat();
	//System.out.println(PorRaejuste);
	
	valReajuste = PorRaejuste/100;
   // System.out.println(valReajuste);
	
	valRea = valReajuste*salAtual;
    salFinal = salAtual + valRea;
	
	System.out.println("Com um reajuste de "+valRea+ " reais seu salario passara a ser de " + salFinal +" reais");
	
	
	
	sc.close();
	
	}
}
