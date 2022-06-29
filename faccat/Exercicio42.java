//42) Uma empresa quer verificar se um empregado est� qualificado para a aposentadoria ou n�o. Para
//estar em condi��es, um dos seguintes requisitos deve ser satisfeito:
// - Ter no m�nimo 65 anos de idade.
// - Ter trabalhado no m�nimo 30 anos.
// - Ter no m�nimo 60 anos e ter trabalhado no m�nimo 25 anos.
//Com base nas informa��es acima, fa�a um algoritmo que leia: o n�mero do empregado (c�digo), o ano
//de seu nascimento e o ano de seu ingresso na empresa. O programa dever� escrever a idade e o tempo
//de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'N�o requerer'

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
	    	System.out.println("O funcionario "+RmEmpresa+" ainda n�o pode requerer");
	    }
		
		
		sc.close();
	}
}
