//10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
//seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
//calcular e escrever o custo final ao consumidor. 

package faccat;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
	
		//73% pois sao 28% do distribuidos mais 45% de impostos federais
		float CustoFab, CustoFim;
		float valorImp = 0.73f ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("escreva o custo de fabrica: ");
		CustoFab = sc.nextFloat(); 
				
		CustoFim = CustoFab + (CustoFab * valorImp);
		
		System.out.println("O valor final do carro será de : "+ CustoFim);
		sc.close();
	}
}
