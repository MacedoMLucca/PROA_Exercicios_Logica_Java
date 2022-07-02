//k) Elaborar um programa que efetue a apresenta��o do valor da convers�o
//            em real (R$) de um valor lido em d�lar (US$). O programa dever�
//            solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
//            dispon�vel com o usu�rio. 

package manzanoEx6;

import java.util.Scanner;

public class Exercicio6Q {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int votosValidos, totalEleitores, pcValidoA, pcValidoB, pcValidoC, pcNulo, pcBranco, pcTotalValido;
		
		System.out.println("Quantidade de votos validos para o candidato A:");
		int candidatoA = sc.nextInt();
		
		System.out.println("Quantidade de votos validos para o candidato B:");
		int candidatoB = sc.nextInt();
		
		System.out.println("Quantidade de votos validos para o candidato C:");
		int candidatoC = sc.nextInt();
		
		System.out.println("Quantidade de votos nulos: ");
		int votosNulos = sc.nextInt();
		
		System.out.println("Quantidade de votos em branco: ");
		int votosBrancos = sc.nextInt();
		
		votosValidos = candidatoA + candidatoB + candidatoC;
		totalEleitores = votosValidos + votosNulos + votosBrancos;
		
		pcTotalValido = (votosValidos * 100) / totalEleitores;
		pcValidoA = (candidatoA * 100) / totalEleitores;
		pcValidoB = (candidatoB * 100) / totalEleitores;
		pcValidoC = (candidatoC * 100) / totalEleitores;
		pcBranco = (votosBrancos * 100) / totalEleitores;
		pcNulo = (votosNulos * 100) / totalEleitores;
		
		System.out.println("Total de eleitores: " + totalEleitores + 
							"\nPercentual de votos validos: " + pcTotalValido + "%" +
							"\nPercentual validos candidato A " + pcValidoA + "%" +
							"\nPercentual validos candidato B " + pcValidoB + "%" +
							"\nPercentual validos candidato C " + pcValidoC + "%" +
							"\nPercentual votos em branco " + pcBranco + "%" +
							"\nPercentual votos nulos " + pcNulo + "%" );
		
		sc.close();
		
	}
}