package Atividade2407;

import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner (System.in);

		int vendas1,vendas2,vendas3,vendas4,total;

		System.out.println("digite um valor de de vendas da primeira semana");
		vendas1 = ler.nextInt();
		System.out.println("digite um valor de de vendas da primeira semana");
		vendas2 = ler.nextInt();
		System.out.println("digite um valor de de vendas da primeira semana");
		vendas3 = ler.nextInt();
		System.out.println("digite um valor de de vendas da primeira semana");
		vendas4 = ler.nextInt();
		
		total=vendas1+vendas2+vendas3+vendas4;

		switch (total) {
		case 1:
			System.out.println("1 venda, Na próxima você consegue, não desista!!!");
			break;
		case 2:
			System.out.println("2 vendas, Na próxima você consegue, não desista!!!");
			break;
		case 3:
			System.out.println("3 vendas, Na próxima você consegue, não desista!!!");
			break;
		case 4:
			System.out.println("4 vendas, Na próxima você consegue, não desista!!!");
			break;
		case 5:
			System.out.println("5 vendas, Na próxima você consegue, não desista!!!");
			break;
		case 6:
			System.out.println("6 vendas, Na próxima você consegue, não desista!!!");
			break;
		case 7:
			System.out.println("7 vendas, Na próxima você consegue, não desista!!!");
			break;
		case 8:
			System.out.println("8 vendas, Na próxima você consegue, não desista!!!");
			break;
		case 9:
			System.out.println("9 vendas, Na próxima você consegue, não desista!!!");
			break;

		case 10:
			System.out.println("10 vendas, Parabéns seu bonûs foi de R$100,00");
			break;
		case 11:
			System.out.println("11 vendas, Parabéns seu bonûs foi de R$100,00");
			break;
		case 12:
			System.out.println("12 vendas, Parabéns seu bonûs foi de R$100,00");
			break;
		case 13:
			System.out.println("13 vendas, Parabéns seu bonûs foi de R$100,00");
			break;
		case 14:
			System.out.println("14 vendas, Parabéns seu bonûs foi de R$100,00");
			break;
		case 15:
			System.out.println("15 vendas, Parabéns seu bonûs foi de R$300,00");
			break;
		case 16:
			System.out.println("16 vendas, Parabéns seu bonûs foi de R$300,00");
			break;
		case 17:
			System.out.println("17 vendas, Parabéns seu bonûs foi de R$300,00");
			break;
		case 18:
			System.out.println("18 vendas, Parabéns seu bonûs foi de R$300,00");
			break;
		case 19:
			System.out.println("19 vendas, Parabéns seu bonûs foi de R$300,00");
			break;
		case 20:
			System.out.println("20 Vendas, Muito bem !!! Parabéns seu bonûs foi de R$500,00");
			break;

		default:
			System.out.println("Excelente Ultrapassou 20 Vendas,Parabéns seu bonûs foi de R$500,00");
			break;

		}
	}

}
