//42) Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
//estar em condições, um dos seguintes requisitos deve ser satisfeito:
// - Ter no mínimo 65 anos de idade.
// - Ter trabalhado no mínimo 30 anos.
// - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
//Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
//de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
//de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'

package faccat;

import java.util.Scanner;

public class Exercicio42 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o RM da empresa: ");
		int RmEmpresa = sc.nextInt();
		
		System.out.println("Digite o ano de seu nascimento: ");
		int anoNasc = sc.nextInt();
		
		System.out.println("Digite o ano em que estamos: ");
		int anoAtual = sc.nextInt();
		
		System.out.println("Digite o ano que entrou na empresa: ");
		int entroEmpresa = sc.nextInt();
		
		int tempoEmpresa = anoAtual - entroEmpresa;
		int idade = anoAtual - anoNasc;
		
		if (idade >= 65) {
			System.out.println("O funcionario "+RmEmpresa+" ja pode 'Requerer aposentadoria'");
	    } else if (tempoEmpresa >= 30) {
	    	System.out.println("O funcionario "+RmEmpresa+" ja pode 'Requerer aposentadoria'"); 
	    }else if (idade >= 60 && tempoEmpresa >= 25) {
	    	System.out.println("O funcionario "+RmEmpresa+" ja pode 'Requerer aposentadoria'");           
	    }else{
	    	System.out.println("O funcionario "+RmEmpresa+" ainda não pode requerer");
	    }
		
		
		sc.close();
	}
}
