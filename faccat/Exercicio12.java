//12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
//correspondente em graus Celsius (baseado na fórmula abaixo):
// 	  C 	 F - 32
// ------ = -------
//    5        9
//Observação: Para testar se a sua resposta está correta saiba que 100C = 212F 


package faccat;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A temperatura em Fahrenheit: ");
		float Gfahren = sc.nextFloat();
		
		float TempC = (5*(Gfahren-32))/9;
		
		System.out.println("A temperatura em graus celsius: "+ TempC);
		sc.close();
	}
}
