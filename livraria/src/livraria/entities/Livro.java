package livraria.entities;

public class Livro {
	
	// Atributos
	public String nome;
	public String descricao;
	public double valor;
	public String isbn;
	
	public Autor autor;  // composicao
	
	// método
	public void mostrarDetalhes() {
		String mensagem = "Mostrando Detalhes do livro";
		System.out.println(mensagem);
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(isbn);
		System.out.println("--");
	}

}
