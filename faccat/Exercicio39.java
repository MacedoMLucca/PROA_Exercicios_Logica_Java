//39) Para A = V, B = V e C = F, qual o resultado da avalia��o das seguintes express�es:
//a) (A e B) ou (A xou B)
//b) (A ou B) e (A e C)
//c) A ou C e B xou A e n�o B 

package faccat;


public class Exercicio39 {
	
	public static void main(String[] args) {
		boolean a = true ,b = true ,c = false;
		
		
		System.out.println((a&&b)||(a!=b));
		System.out.println((a||b)&&(a&&b));
		System.out.println((a|| c && b) != (a != b)	);
		
	}


}
