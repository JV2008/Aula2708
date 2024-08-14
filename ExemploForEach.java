package Atividade2407;

import java.util.ArrayList;
import java.util.Arrays;

public class ExemploForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] diciplinas = {"matemática","filosofia","história","física"}; 
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(diciplinas));
		novaLista.add("geografia");
		novaLista.add("lingua inglesa");

		for (String i: novaLista)
		{
			System.out.println("diciplina: " +i);	
		}



	}

}
