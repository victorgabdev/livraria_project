package livraria.entities.interfaces;

public interface Produto extends Comparable<Produto> {
	public double getValor();  // subtende-se que todo metodo de uma interface é abstrato
}
