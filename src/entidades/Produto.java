package entidades;

public class Produto {
	public String descricao;
	public double preco;
	public int qtde;


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
