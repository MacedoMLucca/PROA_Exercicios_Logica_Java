package manzanoloops.loopsDoWhile;

public class ExercicioD {
	public static void main(String[] args) {
		int contadora = 1, acomuladora = 0;
		
		do{
		    System.out.println(acomuladora);
		    acomuladora = acomuladora*2+1;
		    contadora = contadora+1;
		}while(contadora<=65);
	}
}
