package livraria.services;

import livraria.entities.interfaces.Produto;

public class CarrinhoDeCompras {
	
	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;
	
	/*
	 * Sobrecarga do metodo adiciona
	public void adiciona(Livro livro) {
		System.out.println("Adicionando: " + livro);
		livro.aplicaDescontoDe(0.05);
		total += livro.getValor();
	}
	
	public void adiciona(Revista revista) {
		System.out.println("Adicionando: " + revista );
		revista.aplicaDescontoDe(0.05);
		total += revista.getValor();
	}
	*/
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		this.produtos[contador] = produto;
		contador++;
		total += produto.getValor();
	}

	public double getTotal() {
		return total;
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	
	
}
