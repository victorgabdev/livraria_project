package livraria.entities;

import livraria.entities.interfaces.Produto;
import livraria.entities.interfaces.Promocional;

public class Revista implements Produto, Promocional {
	
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
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
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.1)  return false;
		
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
 	}
	
	@Override
	public int compareTo(Produto outro) {
		if (this.getValor() < outro.getValor()) return -1;
		if (this.getValor() > outro.getValor()) return 1;
		return 0;
	}
}
