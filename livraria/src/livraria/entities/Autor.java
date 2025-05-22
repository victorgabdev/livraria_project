package livraria.entities;

public class Autor {

	// Atributos
	private String nome;
	private String email;
	private String cpf;
	
	//getter and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// metodos
	public void mostrarDetalhes() {
		System.out.println("Mostrando Detalhes do autor");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	}

}
