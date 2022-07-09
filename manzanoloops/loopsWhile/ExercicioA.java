package manzanoloops.loopsWhile;

import java.util.Scanner;

public class ExercicioA {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int numero = sc.nextInt();
	int i = 0;
	
	
	while(i<=10){
	    System.out.println(numero+"x"+i+"="+(numero*i));
	    i++;
	}
	
	sc.close();
  }
}
