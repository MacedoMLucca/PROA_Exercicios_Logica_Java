//c) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando
//            a fórmula: VOLUME = 3.14159 * R ^ 2 * ALTURA.
package manzanoEx6;

import java.util.Scanner;

public class Exercicio6D {

	public static void main(String[] args) {
	 
		 Scanner sc =new Scanner(System.in);
		 
		 System.out.println("Digite o tempo da sua viagem (em horas): ");
		 double TempoViagem = sc.nextDouble();	 
		 
		 System.out.println("Digite a velocidade media do seu carro durante a viagem: ");
		 double Velocidade = sc.nextDouble();
		 
		 
		 double Distacia = TempoViagem * Velocidade;
		 double LitrosUsados = Distacia/12;


		 System.out.println("Foram " + LitrosUsados + " litros usados na viagem");

		 
		 
		 
		 
		 
		 sc.close();
	}

}
