package principal;

import java.util.Scanner;

public class Ano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Informe o ano que deseja verificar: ");
		ano = entrada.nextInt();
		
		if(ano%4==0) {
			System.out.println("Ano Bissexto!");
		}else {
			System.out.println("NÃO é um ano Bissexto!");
		}
		
		entrada.close();

	}

}
