package javaBasico;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		//Primeira mensagem
		// para fazer a escolha do que vai ser feito
		String escolha = JOptionPane.showInputDialog("Escolha uma op��o para fazer a conta "+
														"\n S - Soma            T - Subtra��o"+
														"\n M - Multiplica��o   D - Divis�o");
		
		//Segunda mensagem
		//inser�ao de numeros
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
	
		//ultima parte => escolha de qual o pera��o sera respondida
		if (escolha.equals("s")) {
			//Opera��o matematica 
			int soma = num1 + num2;
			//Forma de aparecer na tela 
			JOptionPane.showMessageDialog(null,"A soma de "+ num1 + " + "+num2+" �: "+soma);
		} else if (escolha.equals("t")) {
			//Opera��o matematica 
			int subt = num1 - num2;
			//Forma de aparecer na tela
			JOptionPane.showMessageDialog(null,"A subtra��o de "+ num1 + " - "+num2+" �: "+subt);
		}else if (escolha.equals("m")) {
			//Opera��o matematica 
			int mult = num1 * num2;
			//Forma de aparecer na tela
			JOptionPane.showMessageDialog(null,"A multiplica��o de "+ num1 + " x "+num2+" �: "+mult);
		}else if (escolha.equals("d")) {
			//Opera��o matematica 
			int div = num1 / num2;
			//Forma de aparecer na tela
			JOptionPane.showMessageDialog(null,"A divis�o de "+ num1 + " / "+num2+" �: "+div);
		}
		
	}
		
}
