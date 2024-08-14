package Atividade2407;

import java.util.Scanner;

import java.util.ArrayList;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		ArrayList<Integer>valores= new ArrayList <Integer>();
		
	
	int soma=0;
	int vl;
	
	
	for (int i=0; i<5;i++) {
		System.out.println("Digite um número");
		vl=ler.nextInt();
		valores.add(vl);
		soma+=vl;
	}
	
	for(int l:valores) {
		
	
	System.out.println("Os números da lista são "+l);
	}
	System.out.println("Os números da lista somados são " +soma);
	
	
	
	ler.close();
	}
}
