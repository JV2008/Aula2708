package Atividade2407;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner ler= new Scanner (System.in);

		int dia;

		System.out.println("digite um valor de 1 à 7");
		dia = ler.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo-Feira");
		break;
		
		case 2:
			System.out.println("Segunda-Feira");
		break;
		
		case 3:
			System.out.println("Terça-Feira");
		break;
		
		case 4:
			System.out.println("Quarta-Feira");
			break;
		
		case 5:
			System.out.println("Quinta-Feira");
			break;
		
		case 6:
			System.out.println("Sexta-Feira");
			break;
		
		case 7:
			System.out.println("Sabado");
			default:
				System.out.println("Sabado");
				break;




		}

	}
}


