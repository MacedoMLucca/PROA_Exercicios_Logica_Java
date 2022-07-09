package manzanoloops.loopsWhile;

public class ExercicioH {

	public static void main(String[] args) {
		int contadora = 10, c = 0, f = 0;
		
		while(contadora<=100){
		    c = contadora;
		    f = (9*c+160)/5;
		    System.out.println("A conversão de "+c+" °C, para Fahrenheit é "+f+" °F");
		    contadora = contadora + 10;
		}

	}

}
