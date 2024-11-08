package aulaLacosRepeticao;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int i, num;
		
		System.out.println("************* TABUADA *************");
		System.out.println("Digite o número que você quer exibir a tabuada: ");
		num = leia.nextInt();
		
		for (i = 0; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}

	}

}
