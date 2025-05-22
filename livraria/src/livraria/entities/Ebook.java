package livraria.entities;

public class Ebook extends Livro {
	
	// Atributos
	private String watermark;  // marca d'agua
	
	public Ebook(Autor autor) {
		super(autor);  // delegate constructor
	}

	// getters and setters
	public String getWatermark() {
		return watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) return false;
		
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		System.out.println("Aplicando desconto no Ebook");
		return true;
	}

}
