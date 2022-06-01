package javaBasico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class PrimeiraProgramaJava {

	public static void main(String[] args) {
		System.out.println("Hello World");
	
		
	
	int nota1,nota2,nota3,nota4;
	double md;
		
	/*Scanner sc = new Scanner(System.in);
	System.out.print("Digite um numero: ");
	nota1 = sc.nextInt();
	System.out.print("Digite o segundo numero: ");
	nota2 = sc.nextInt();
	System.out.print("Digite o terceiro numero: ");
	nota3 = sc.nextInt();
	System.out.print("Digite o quarto numero: ");
	nota4 = sc.nextInt();*/
	
	
	nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
	/*System.out.println(nota1);*/
	nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
	/*System.out.println(nota2);*/
	nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero: "));
	/*System.out.println(nota3);*/
	nota4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto numero: "));
	/*System.out.println(nota4);*/
		
	md = ( nota1 + nota2 + nota3 + nota4 ) / 4 ;
	
	if (md >= 6 ) {
		/*System.out.print("PARABENS, o aluno passou de serie, nota media de "+md);*/
		JOptionPane.showMessageDialog(null, "PARABENS, o aluno passou de serie, nota media de "+md);
	} else {
		/*System.out.print("QUE PENA, o aluno não passou de serie, nota media de "+md);*/
		JOptionPane.showMessageDialog(null, "QUE PENA, o aluno não passou de serie, nota media de "+md);	
	}
	
	
	}
}
