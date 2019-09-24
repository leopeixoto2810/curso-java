
package entidades;

public class ProdutoEncapsulamento {
	private String descricao;
	private double preco;
	private int qtde;

	// INICIO CONSTRUTORES
	// construtor padrao
	public ProdutoEncapsulamento() {

	}

	public ProdutoEncapsulamento(String descricao, double preco, int qtde) {
		this.descricao = descricao;
		this.preco = preco;
		this.qtde = qtde;
	}

	public ProdutoEncapsulamento(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	// FIM CONSTRUTORES
	
	// por convensão, os metodos get e set são criados depois dos contrutores
	// INICIO GETTERS E SETTERS
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQtde() {
		return qtde;
	}


	// FIM GETTERS E SETTERS
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
