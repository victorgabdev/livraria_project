package livraria;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
	
	private Map<String, Double> cupons;
	
	public GerenciadorDeCupons() {
		
		this.cupons = new HashMap<>();
		
		cupons.put("CUP74", 10.0);
	    cupons.put("CUP158", 15.0);
	    cupons.put("CUP14", 5.0);
	    cupons.put("CUP52", 7.5);
	    cupons.put("CUP21", 12.0);
	    cupons.put("CUP221", 8.0);
	    cupons.put("CUP91", 6.0);
	    cupons.put("CUP327", 10.0);
	    cupons.put("CUP410", 9.0);
	    cupons.put("CUP275", 11.0);
	    cupons.put("CUP484", 14.0);
	    cupons.put("CUP207", 13.0);
	    cupons.put("CUP96", 7.0);
	    cupons.put("CUP119", 6.5);
	    cupons.put("CUP174", 12.5);
	    cupons.put("CUP291", 10.5);
	    cupons.put("CUP1", 5.5);
	    cupons.put("CUP115", 9.5);
	    cupons.put("CUP222", 11.5);
	    cupons.put("CUP272", 8.5);
		
	}
	
	public Double validaCupon(String cupom) {
		return this.cupons.get(cupom);
	}
}
