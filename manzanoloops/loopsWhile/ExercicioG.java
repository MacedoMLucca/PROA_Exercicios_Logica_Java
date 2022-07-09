package manzanoloops.loopsWhile;

public class ExercicioG {

	public static void main(String[] args) {
		int contadora = 0,numero = 0,numeroaux = 1,resultado = 1;
		
		System.out.println(numeroaux);
		while(contadora<=15){
		    resultado = numero+numeroaux;
		    numero = numeroaux;
		    numeroaux = resultado;
		    System.out.println(resultado);
		    contadora = contadora + 1; 
		}
	}

}
