package aulaLacosRepeticao;

import java.util.Scanner;

public class multiplicaPor5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, resultado, contador = 3;
		
		System.out.println("********************** MULTIPLICAÇÃO POR 5 **********************");
		
		do{
			
			System.out.println("Digite o número para a multiplicação: ");
			num = leia.nextInt();
			
			resultado = (num * 5);
			System.out.println("O resultado da multiplicação é " + resultado);
			
		} while(contador <= 2);
		
		System.out.println("******************************************************************");
		System.out.println("\nSistema finalizado.");
		leia.close();

	}

}
