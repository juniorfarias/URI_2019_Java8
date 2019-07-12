package URI1114;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int senha = in.nextInt();
	
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			
			senha = in.nextInt();
		}
		
		System.out.println("Acesso Permitido");
			
		in.close();	
	}
}
