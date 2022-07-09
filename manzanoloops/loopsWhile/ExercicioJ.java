package manzanoloops.loopsWhile;

public class ExercicioJ {

	public static void main(String[] args) {
		int contadora = 50, numero = 0;
		
		while(contadora<=70){
		    numero = numero+contadora;
		    contadora = contadora+2;
		}

		System.out.println("A soma dos numeros pares de 50 ate 70 é "+numero);
		System.out.println("A media da soma dos numeros pares de 50 ate 70 é "+(numero/20));
	}

}
