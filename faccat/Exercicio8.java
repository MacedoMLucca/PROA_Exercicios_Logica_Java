//8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores. 


package faccat;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
	
		int TotalEleitor, votoB,porVB, votoN,porVN, votoV,porVV;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero total de eleitores: ");
		TotalEleitor = sc.nextInt();
		
		System.out.println("Digite o numero total de votos brancos: ");
		votoB = sc.nextInt();
		porVB = votoB*100/TotalEleitor;
		
		System.out.println("Digite o numero total de votos nulos: ");
		votoN = sc.nextInt();
		porVN = votoN*100/TotalEleitor;
		
		System.out.println("Digite o numero total de votos validos: ");
		votoV = sc.nextInt();
		porVV = votoV*100/TotalEleitor;
		
		
		System.out.println("Os votos Brancos representam "+porVB+"% ,e os votos nulos representam "+porVN+ "% os votos validos representam "+porVV+"% ,de um total de " +TotalEleitor);
		
		sc.close();
	}

}
