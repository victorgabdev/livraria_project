package livraria.entities;

import livraria.entities.interfaces.Produto;
import livraria.exception.AutorNuloException;

public abstract class Livro implements Produto {
	
	// Atributos
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	
	public Autor autor;  // Composicao
	
	// Sobrecarga (overloaded) de construtores
	/*
	public Livro() {
		this.isbn = "000-00-00000-00-00";
	}
	*/
	
	public Livro(Autor autor) {
		//this();  // Vai chamar o outro construtor
		
		if (autor == null) throw new AutorNuloException("O autor do Livro não pode ser nulo");
		
		this.autor = autor;
		this.isbn = "000-00-00000-00-00";
	}
	
	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	// métodos
	@Override
	public String toString() {
		System.out.println("Mostrando Detalhes do livro");
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(isbn);
		
		if(this.temAutor()) autor.mostrarDetalhes();
		System.out.println("--");
		
		return "";
	}
	
	//public abstract boolean aplicaDescontoDe(double porcentagem); interface Promocional
	
	public boolean temAutor() {
		return this.autor != null; // expressao booleana 
	}
	
	

}
