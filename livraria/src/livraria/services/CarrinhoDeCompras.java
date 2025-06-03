package livraria.services;

import java.util.ArrayList;
import java.util.List;

import livraria.entities.interfaces.Produto;

public class CarrinhoDeCompras {
	
	private double total;
	private List<Produto> produtos;  // Generics
	//private int contador = 0;
	
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
	
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<>();  // Diamond Operator, Polimorfismo
	}
	
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}

	public double getTotal() {
		return total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	/*
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	*/
	
	
	
}
