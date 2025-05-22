package livraria;

import livraria.entities.Autor;
import livraria.entities.Livro;

public class LivroFisico extends Livro {

	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
	
	

}
