package livraria;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import livraria.entities.interfaces.Produto;

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
		
		/*
		// Toda String é imutável
		String java = new String("Java");
		
		// Generics
		ArrayList<String> lista = new ArrayList<>();  // Diamond Operator
		String valor = "conhecendo uma ArrayList";
		lista.add(valor);
		System.out.println(lista.contains(valor));
		lista.remove(valor);
		System.out.println(lista.contains(valor));
		
		List<String> listaArray = new ArrayList<>();
		List<String> listaLinked = new LinkedList<>();  // Polimorfismo
		
		
		List<String> nomes = new ArrayList<>();  // Diamond Operator, Polimorfismo
		nomes.add("Rodrigo Turini");
		nomes.add("Adriano Almeida");
		nomes.add("Paulo Silveira");
		
		for (String nome : nomes) {  // enhanced - for
			System.out.println(nome);
		}
		
		System.out.println("-----------");
		
		Collections.sort(nomes);  // ordernar os nomes
		
		for (String nome : nomes) {  // enhanced - for
			System.out.println(nome);
		}
		
		*/
		
		List<Produto> produtos = new ArrayList<>();
		Collections.sort(produtos);
	}
	
	public static void abreArquivo() throws FileNotFoundException {
		//new java.io.FileInputStream("arquivo.txt");	// Fully Qualified Name
	}

}
