package livraria.entities;

public class Livro {
	
	// Atributos
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	
	public Autor autor;  // composicao
	
	public Livro() {
		System.out.println("Livro criado!");
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
	public void mostrarDetalhes() {
		System.out.println("Mostrando Detalhes do livro");
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(isbn);
		
		if(this.temAutor()) autor.mostrarDetalhes();
		System.out.println("--");
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) return false;
		
		this.valor -= this.valor * porcentagem;
		return true;
	}
	
	public boolean temAutor() {
		return this.autor != null; // expressao booleana 
	}

}
