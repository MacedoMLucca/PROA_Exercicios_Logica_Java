//11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
//vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
//vendedor. 

package faccat;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		float quantidadeCarrosVendidos,totalVendas, salarioFixo, valorCarroVendido, comissaoFixa, comissaoVariavel,salarioFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de carros vendidos por você:");
		quantidadeCarrosVendidos = sc.nextFloat();
		
		System.out.println("Digite o valor total de suas vendas:");
		totalVendas = sc.nextFloat();
		
		System.out.println("Digite o seu salário fixo:");
		salarioFixo = sc.nextFloat();
		
		System.out.println("Digite o valor recebido por cada carro vendido:");
		valorCarroVendido = sc.nextFloat();
		
		
		comissaoFixa = quantidadeCarrosVendidos*valorCarroVendido;
		comissaoVariavel = totalVendas*5/100;
		salarioFinal = salarioFixo + comissaoFixa + comissaoVariavel; 
		
		System.out.println("O salário final corresponde a: R$"+salarioFinal);
		sc.close();
	}
}
