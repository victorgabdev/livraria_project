package livraria.entities.interfaces;

@FunctionalInterface  // Interface funcional -> Interface com um único método abstrato
public interface Promocional {
	
	// Interface Funcional pode ter somente um método abstrato
	boolean aplicaDescontoDe(double porcentagem);  // metodo abstrato 
	
	// Favorecer a interface para criar polimorfismo, pois diminui o acoplamento entre 
	// as classes e deixa o Código mais flexível
	
	// default method -> A partir do java 8, permite metodo concreto para interfaces
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.1);
	}
	
	// Interface funcional pode ter mais de um default method
	default boolean aplicaDesconteDe15Porcento() {
		return aplicaDescontoDe(0.15);
	}
}
