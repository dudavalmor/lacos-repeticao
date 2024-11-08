package aulaLacosRepeticao;

import java.util.Scanner;

public class multiplicacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, resultado;
		int contador = 1;
		
		System.out.println("*************************************************");
		System.out.println("Pense em 3 números para multiplicarmos por 3.");
		System.out.println("*************************************************\n");
		
		while(contador < 4) {
			
			System.out.println("Digite o " + contador + "º número: ");
			num = leia.nextInt();
			
			resultado = (num * 3);
			System.out.println(contador + " x 3 = " + resultado + "\n");
			contador++;
			
		}
		
		System.out.println("Sistema finalizado.");
		leia.close();

	}

}
