package principal;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextDouble();
		
		System.out.println("Digite a quarta nota");
		nota4 = entrada.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media > 5 && media < 6) {
			System.out.println("REPROVADO! A média é: "+media);
		}else if(media > 6 && media < 7) {
			System.out.println("RECUPERAÇÃO! A média é: "+media);
		}else if(media > 7 && media < 9.99) {
			System.out.println("APROVADO! A média é: "+media);
		}else if(media == 10) {
			System.out.println("APROVADO COM HONRAS! A média é: "+media);
		}else {
			System.out.println("Média Insuficiente! A média é: "+media);
		}
		
		entrada.close();

	}

}
