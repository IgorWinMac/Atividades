package principal;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = entrada.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("O n�mero 1 � maior");
		}else if((num2 > num1)&& (num2 > num3)) {
			System.out.println("O n�mero 2 � maior");
		}else {
			System.out.println("O n�mero 3 � maior");
		}
		
		entrada.close();

	}

}
