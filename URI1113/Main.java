package URI1113;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			int x = entrada.nextInt();
			int y = entrada.nextInt();
			
			if(x<y) {
				System.out.println("Crescente");
			} else if(x>y) {
				System.out.println("Decrescente");
			} else {
				break;
			}
		}
		
		entrada.close();

	}

}
