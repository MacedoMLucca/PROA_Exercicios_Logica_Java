//23): Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule 
//e mostre seu peso ideal, utilizando as seguintes fórmulas: (para sexo masculino: peso ideal = (72.7 * altura) - 58 e para 
//sexo feminino: peso ideal = (62.1 * altura) - 44.7). 
       

package faccat;

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String nome,sexo;
		double altura,peso_ideal;
		
		
		System.out.println("Informe sua altura: ");
		altura = sc.nextDouble();
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digte seu sexo (com M ou F): ");
		sexo = sc.next();
		
		if (sexo.equals("m")) {
			peso_ideal = (72.7 * altura) - 58;
		} else {
			peso_ideal = (62.1 * altura) - 44.7;
		}	
		System.out.printf("Olá "+nome+" !, seu peso ideal e de: "+peso_ideal+" KG");
		
		sc.close();
	}
}
