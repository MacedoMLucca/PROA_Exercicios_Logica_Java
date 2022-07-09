package manzanoloops.loopsWhile;

public class ExercicioE {
	public static void main(String[] args) {
		
		int i = 0, base = 3;
		
		while(i<15){
			if(i == 0) {
				System.out.println("O resultado do numero 3 elevado a "+i+" é: 1");
			}
		    i++;
		    System.out.println("O resultado do numero 3 elevado a "+i+" é: "+ base);
		    base = base * 3;
		    
		}
	}
}
