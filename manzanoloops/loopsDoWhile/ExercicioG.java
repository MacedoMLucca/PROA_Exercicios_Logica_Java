package manzanoloops.loopsDoWhile;

public class ExercicioG {

	public static void main(String[] args) {
		int contadora = 1, fat = 1;

		do {
			fat = fat * contadora;
			if (contadora % 2 != 0) {
				System.out.println(contadora + " = " + fat);
			}
			contadora = contadora + 1;

		} while (contadora <= 10);

	}

}
