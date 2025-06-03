package livraria;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import livraria.entities.Autor;
import livraria.entities.Ebook;
import livraria.entities.Livro;
import livraria.entities.LivroFisico;
import livraria.entities.interfaces.Produto;

public class OrdenandoComJava {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Java 8 Prático");
		ebook.setValor(29.90);
		
		List<Produto> produtos = Arrays.asList(livro, ebook);
		
		Collections.sort(produtos);
		for (Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
		
	}

}
