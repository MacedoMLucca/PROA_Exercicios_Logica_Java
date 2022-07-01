//Digite 3 numeros para calcularmos a Formula de BaSKHARA.

package manzanoEx3;

import java.util.Scanner;

public class Baskhara {

	public static void main(String[] args) {
		
		float DELTA,x1,x2;
		float calcDELTA1,calcDELTA2,calcRU1,calcRU2,pa1,pa2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do A: ");
		float a = sc.nextFloat(); 
		
		System.out.println("Informe o valor do B: ");
		float b = sc.nextFloat();
		
		System.out.println("Informe o valor do C: ");
		float c = sc.nextFloat();
		
		pa1 = b*b;
	    pa2 = 4*a*c;
	    DELTA = pa1-pa2;
	    
	    System.out.println(DELTA);
	    if (DELTA < 0) {
	    	System.out.println("Não existe raiz real");
	     
	    }
	    else if (DELTA == 0) {
	        x1 = -b/2*a;
	        System.out.println("O valor de X seria: " + x1);
	        
	      
	    }
	    else if (DELTA>0) {
	        calcDELTA1 = (float) (-b + Math.sqrt(DELTA));
	        calcDELTA2 = (float) (-b - Math.sqrt(DELTA));
	        calcRU1 = 2*a;
	        calcRU2 = 2*a;
	        x1= calcDELTA1/calcRU1;
	        x2 = calcDELTA2/calcRU2;
	        System.out.println("O valor de X1 seria "+x1+" e o valor de X2 seria "+x2);
	    }
		
		
		sc.close();

	}

}
