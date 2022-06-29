/* 37) Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo seja
diferente de um c�digo armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem �Usu�rio inv�lido!�. Caso o C�digo seja correto, deve ser lido outro valor que � a senha. Se
esta senha estiver incorreta (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�. Caso a
senha esteja correta, deve ser mostrada a mensagem �Acesso permitido�.
 */

package faccat;

import java.util.Scanner;

public class Exercicio37 {
	
	public static void main(String args[]) {
		
		int ValUsuario = 1234;
		int ValSenha = 9999;
		int usuario, senha;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo de usu�rio: ");
		usuario = sc.nextInt();
		
		if(usuario != ValUsuario) {
			System.out.println("{Error} Usuario inv�lido, tente novamente!");
			
		}else if(usuario == ValUsuario) {
			System.out.println(" Digite sua senha: ");
			senha = sc.nextInt();
			
			if(senha != ValSenha) {
				System.out.println("{Error} senha inv�lida, tente novamente!");
				
			}else if(senha == ValSenha) {
				System.out.println("Acesso permitido! seja bem vindo");
			}
		}
		
		sc.close();
	}


}
