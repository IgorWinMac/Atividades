package principal;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = entrada.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("O número 1 é maior");
		}else if((num2 > num1)&& (num2 > num3)) {
			System.out.println("O número 2 é maior");
		}else {
			System.out.println("O número 3 é maior");
		}
		
		entrada.close();

	}

}
