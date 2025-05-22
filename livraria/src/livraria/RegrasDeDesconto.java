package livraria;

import livraria.entities.Livro;

public class RegrasDeDesconto {
	
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.valor = 59.90;
		
		System.out.println("Valor Atual: " + livro.valor);
		
		if(!livro.aplicaDescontoDe(0.4)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.valor);
		}
	}

}
