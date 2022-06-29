package javaBasico;

import java.util.Scanner;

public class CalculadoraComPassagemDeParametros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo(a) a calculadora ShortCalculos");
		System.out.println("Digite o primeiro valor: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite a operação sera feita: [1]-SOMA, [2]-SUBTRAÇÃO,[3]-MULTIPLICAÇÃO,[4]-DIVISÃO");
		int operacao = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int num2 = sc.nextInt();
		

		switch (operacao) {
		case 1:

			System.out.println(soma(num1,num2));
			break;

		case 2:
			System.out.println(subt(num1,num2));

			break;
		
		case 3:
			System.out.println(mult(num1,num2));
			break;
		
		case 4:
			System.out.println(div(num1,num2));
			break;
		
		default:
			break;
		}
		
		sc.close();		
	}
	
	
	static int soma(int numero,int numero2) {
		return numero + numero2;
	}

	static int subt(int numero,int numero2) {
		return numero - numero2;
	}
	
	static int mult(int numero,int numero2) {
		return numero * numero2;
	}
	
	static int div(int numero,int numero2) {
		return numero / numero2;
	}
	
	
	
}
