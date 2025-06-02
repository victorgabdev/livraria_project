package livraria.services;

import livraria.entities.Autor;
import livraria.entities.Livro;
import livraria.entities.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo@gmail.com");
		autor.setCpf("123.456.789-10");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");

		livro.toString();
		
		Autor outroAutor = new Autor();
		autor.setNome("Paulo Silveira");
		autor.setEmail("paulo@gmail.com");
		autor.setCpf("123.456.789-10");
		
		Livro outroLivro = new LivroFisico(outroAutor);	
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");

		outroLivro.toString();
		
		
	}

}
