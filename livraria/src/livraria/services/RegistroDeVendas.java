package livraria.services;

import livraria.entities.Autor;
import livraria.entities.CarrinhoDeCompras;
import livraria.entities.Ebook;
import livraria.entities.LivroFisico;

public class RegistroDeVendas {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.9);
		
		if (fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é " + fisico.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: " + carrinho.getTotal());
	}

}
