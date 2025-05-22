package livraria;

import livraria.entities.Autor;
import livraria.entities.Livro;

public class RegrasDeDesconto {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo@gmail.com");
		autor.setCpf("123.456.789-10");
		
		Livro livro = new Livro(autor);
		livro.setValor(59.90);
		
		System.out.println("Valor Atual: " + livro.getValor());
		
		if(!livro.aplicaDescontoDe(0.4)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}
	}

}
