package aulaLacosRepeticao;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1, num2, resultado;
		String continua = "s";
		
		System.out.println("******************* SOMA DE DOIS NÚMEROS *******************");
		
		while(!continua.equals("n")) {
			
			System.out.println("\nDigite o primeiro número: ");
			num1 = leia.nextInt();
			System.out.println("Digite o segundo número: ");
			num2 = leia.nextInt();
			
			resultado = (num1 + num2);
			System.out.println("O resultado da soma é: " + resultado);
			
			System.out.println("\n******************** MENU ********************");
			System.out.println("Deeseja fazer somar outros dois valores?\nDige s para sim OU n para não: ");
			continua = leia.next();

			}
		
			System.out.println("Sistema finalizado. ");
			leia.close();
			
			
		}

	}