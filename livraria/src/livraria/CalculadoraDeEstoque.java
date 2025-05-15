package livraria;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		
		/*
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
		//int livro = (int) livroJava8;  // casting -> (59)
		
		double soma = livroJava8 + livroTDD;
		
		System.out.println("O total em estoque é: " + soma);
		
		if(soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if (soma < 2000) {
			System.out.println("Seu estoque está bom");
		} else {
			System.out.println("Seu estoque está muito alto!");
		}
		
		double valor = v1 > v2 ? 100 : 0;  -> Operador Ternário
		*/
		
		/*
		double soma = 0;
		for (int index = 0; index < 35; index++) {
			double valorDoLivro = 59.90;
			soma += valorDoLivro;
		}
		
		System.out.println("O total em estoque é: " + soma);
		
		if(soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if (soma < 2000) {
			System.out.println("Seu estoque está bom");
		} else {
			System.out.println("Seu estoque está muito alto!");
		}
		
		*/
		
		for(int i = 0; i <= 10; i++) {
			if (i == 6) continue;  // break
			System.out.println("Número: " + i);
		}
		
		
	}

}
