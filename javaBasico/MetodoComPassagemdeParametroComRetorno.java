package javaBasico;

public class MetodoComPassagemdeParametroComRetorno {

	public static void main(String[] args) {
		System.out.println("O resultado final � : "+ soma(20));
		System.out.println("O resultado final � : "+ subtracao(100));
		System.out.println("O resultado final � : "+ mult(10));
		System.out.println("O resultado final � : "+ div(12));
	}
	
	static int soma(int valor) {
		return 5 + valor;
	}
	static int subtracao(int valor1) {
		
		return valor1 - 70;
	}
	static int mult(int valor2) {
		
		return valor2*2;
	}
	static double div(double valor3) {
		
		return valor3 / 2;
	}
	
	
}
