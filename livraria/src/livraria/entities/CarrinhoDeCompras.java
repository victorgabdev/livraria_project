package livraria.entities;

public class CarrinhoDeCompras {
	
	private double total;
	
	/*
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
		//produto.aplicaDesdoteDe(0.16);
		total += produto.getValor();
	}

	public double getTotal() {
		return total;
	}
	
}
