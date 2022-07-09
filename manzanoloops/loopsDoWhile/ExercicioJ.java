package manzanoloops.loopsDoWhile;

import java.util.Scanner;

public class ExercicioJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean contadora = true;
		
		System.out.println("Agora iremos começar a calcular para você a sua conta");
		do {
			System.out.println("Digite o numero do dividendo: ");
			int dividendo = sc.nextInt();
			
			System.out.println("Digite o numero do divisor: ");
			int divisor = sc.nextInt();
			
			if(dividendo%divisor == 0) {
				System.out.println("Quociente é = "+dividendo/divisor);
			}else {
				System.out.println("O quociente não sera inteiro");
			}
			System.out.println("Quer realizar outra conta de divisão que apresente o quociente como inteiro? Digite (1) para sim, (2) para não: ");
			int resposta = sc.nextInt();
			
			if(resposta == 2){
		        contadora = false;
		    }else{
		        contadora = true;
		    }
			
		}while(contadora != false);
		
		sc.close();
	}

}
