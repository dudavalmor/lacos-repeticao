package aulaLacosRepeticao;

import java.util.Scanner;

public class exibirNomes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int i;
		
		System.out.println("*************** ESCOLHA O NOME DE 3 PESSOAS ***************");
		
		for (i = 0; i < 4; i++) {
			System.out.println("Digite o nome da " + (i+1) + "º pessoa: ");
			nome = leia.nextLine();
			System.out.println("O " + (i + 1) + "º nome é: " + nome + ".\n");
			
		}
		

	}

}
