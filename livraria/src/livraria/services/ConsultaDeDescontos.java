package livraria.services;

import livraria.GerenciadorDeCupons;

public class ConsultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		Double desconto = gerenciador.validaCupon("CUP158");
		
		if(desconto != null) {
			System.out.println("Cupom de desconto válido");
			System.out.println("Valor: " + desconto);
		} else {
			System.out.println("Esse cupom não existe");
		}

	}

}
