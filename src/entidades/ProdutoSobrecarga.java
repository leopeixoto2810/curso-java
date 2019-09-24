package entidades;

public class ProdutoSobrecarga {
	public String descricao;
	public double preco;
	public int qtde;

	//construtor padrao
	public ProdutoSobrecarga() {
		
	}
	// Entre os atributos e metodos será criado um construtor, o qual será executado
	// na inicialização da classe obrigatoriamente.
	// Pode ser utilizado pra obrigar a inicialização os atributos por exemplo, ao
	// se instanciar a classe no projeto, o que é chamado de "Injeção de
	// dependencias".
	// Uma classe pode ter mais de um construtor, inclusive com o mesmo nome, o que é chamado de "Sobrecarga".
	public ProdutoSobrecarga(String descricao, double preco, int qtde) {
		this.descricao = descricao;
		this.preco = preco;
		this.qtde = qtde;
	}
	
	public ProdutoSobrecarga(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}
	public double valorTotalEmEstoque() {
		return preco * qtde;
	}

	public void adicionarProdutos(int qtde) {
		// comando this serve para referencia ao atributo da classe e não a variavel que
		// está sendo passada por parametro
		this.qtde += qtde;
	}

	public void removerProdutos(int qtde) {
		this.qtde -= qtde;
	}

	// todo objeto possui o metodo toString(), porem declarando na classe, o java
	// sobrepoe autometicamente a função nativa pela declarada na clase
	public String toString() {
		return "O produto " + descricao.toUpperCase() + ", custa R$ " + String.format("%.2f", preco) + ", tem " + qtde
				+ " unidades em estoque, resultando em um valor total de R$ "
				+ String.format("%.2f", valorTotalEmEstoque()) + ".";
	}
}
