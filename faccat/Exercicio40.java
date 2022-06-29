//40) Fa�a um algoritmo para ler: a descri��o do produto (nome), a quantidade adquirida e o pre�o
//unit�rio. Calcular e escrever o total (total = quantidade adquirida * pre�o unit�rio), o desconto e o total
//a pagar (total a pagar = total - desconto), sabendo-se que:
// - Se quantidade <= 5 o desconto ser� de 2%
// - Se quantidade > 5 e quantidade <=10 o desconto ser� de 3%
// - Se quantidade > 10 o desconto ser� de 5% 
 
package faccat;

import java.util.Scanner;

public class Exercicio40 {
	
	public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	
	float desconto = 0, totPagar;
	
	System.out.println("Digite o nome do produto: ");
	String nomeProduto = sc.next();
	
	System.out.println("Digite a quantidade do produto: ");
	float qtdProduto = sc.nextFloat();

	System.out.println("Digite pre�o unitario: ");
	float precoUni = sc.nextFloat();

	float total = qtdProduto * precoUni;
  
    if (qtdProduto <= 5) {
        desconto = total- (total* 2/100);
    } else if (qtdProduto > 5 && qtdProduto <= 10) {
        desconto = total- (total* 3/100);
    }else if (qtdProduto > 10) {
        desconto = total- (total* 5/100);
    }
    
    totPagar = total - desconto;
    
    System.out.println("O produto "+nomeProduto+" vai sair por: R$"+totPagar+" ja com desconto");

    
    sc.close();
	}

}
