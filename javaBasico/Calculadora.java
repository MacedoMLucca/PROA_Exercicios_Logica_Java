package javaBasico;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		//Primeira mensagem
		// para fazer a escolha do que vai ser feito
		String escolha = JOptionPane.showInputDialog("Escolha uma opção para fazer a conta "+
														"\n S - Soma            T - Subtração"+
														"\n M - Multiplicação   D - Divisão");
		
		//Segunda mensagem
		//inserçao de numeros
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
	
		//ultima parte => escolha de qual o peração sera respondida
		if (escolha.equals("s")) {
			//Operação matematica 
			int soma = num1 + num2;
			//Forma de aparecer na tela 
			JOptionPane.showMessageDialog(null,"A soma de "+ num1 + " + "+num2+" é: "+soma);
		} else if (escolha.equals("t")) {
			//Operação matematica 
			int subt = num1 - num2;
			//Forma de aparecer na tela
			JOptionPane.showMessageDialog(null,"A subtração de "+ num1 + " - "+num2+" é: "+subt);
		}else if (escolha.equals("m")) {
			//Operação matematica 
			int mult = num1 * num2;
			//Forma de aparecer na tela
			JOptionPane.showMessageDialog(null,"A multiplicação de "+ num1 + " x "+num2+" é: "+mult);
		}else if (escolha.equals("d")) {
			//Operação matematica 
			int div = num1 / num2;
			//Forma de aparecer na tela
			JOptionPane.showMessageDialog(null,"A divisão de "+ num1 + " / "+num2+" é: "+div);
		}
		
	}
		
}
