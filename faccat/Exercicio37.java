/* 37) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
 */

package faccat;

import java.util.Scanner;

public class Exercicio37 {
	
	public static void main(String args[]) {
		
		int ValUsuario = 1234;
		int ValSenha = 9999;
		int usuario, senha;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo de usuário: ");
		usuario = sc.nextInt();
		
		if(usuario != ValUsuario) {
			System.out.println("{Error} Usuario inválido, tente novamente!");
			
		}else if(usuario == ValUsuario) {
			System.out.println(" Digite sua senha: ");
			senha = sc.nextInt();
			
			if(senha != ValSenha) {
				System.out.println("{Error} senha inválida, tente novamente!");
				
			}else if(senha == ValSenha) {
				System.out.println("Acesso permitido! seja bem vindo");
			}
		}
		
		sc.close();
	}


}
