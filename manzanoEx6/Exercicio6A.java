//a) Ler uma temperatura em graus Celsius e apresent�-la convertida em  graus Fahrenheit. A f�rmula de convers�o �: F((9* C + 160) / 5, sendo
//F a temperatura em Fahrenheit e C a temperatura em Celsius.

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6A {

	public static void main(String[] args) {
		 float GCelsius , TempFinal;
		 
		 Scanner sc =new Scanner(System.in);
		 
		 
		 System.out.println("Escreva a temperatura que voc� converter: ");
		 GCelsius = sc.nextFloat();
		 TempFinal = (9*GCelsius+160)/5;

		 System.out.println("Fazendo a conversao, " + GCelsius + " graus celsius sao equivalentes a "+ TempFinal+" fahrenheit");

		 
		 sc.close();
	}

}
