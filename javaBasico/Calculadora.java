package javaBasico;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		//Primeira mensagem
		// para fazer a escolha do que vai ser feito
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção para fazer a conta "+
														"\n 1 - Soma            2 - Subtração"+
														"\n 3 - Multiplicação   4 - Divisão"));
		
		//Segunda mensagem
		//inserçao de numeros
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
	
		//ultima parte => escolha de qual o peração sera respondida
		if (escolha == 1) {
			//Operação matematica 
			int soma = num1 + num2;
			//Forma de aparecer na tela 
			JOptionPane.showMessageDialog(null,soma);
		} else if (escolha == 2) {
			//Operação matematica 
			int subt = num1 - num2;
			//Forma de aparecer na tela
			JOptionPane.showMessageDialog(null,subt);
		}else if (escolha == 3) {
			//Operação matematica 
			int mult = num1 * num2;
			//Forma de aparecer na tela
			JOptionPane.showMessageDialog(null,mult);
		}else if (escolha == 4) {
			//Operação matematica 
			int div = num1 / num2;
			//Forma de aparecer na tela
			JOptionPane.showMessageDialog(null,div);
		}
		
	}
		
}
