package livraria;

import java.io.FileNotFoundException;

public class MeuPrimeiroPrograma {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("O primeiro de muitos!");
		
		// Fully qualified name
		//new java.io.FileInputStream("arquivo.txt");
		
		/*
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Não consegui abrir o arquivo.");
		}
		*/
		
		abreArquivo();
	}
	
	public static void abreArquivo() throws FileNotFoundException {
		new java.io.FileInputStream("arquivo.txt");	// Fully Qualified Name
	}

}
