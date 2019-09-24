package orientadoaobjeto;

import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutoSobrecarga;

public class ControleEstoqueSobrecarga {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	    //como foi colocado o construtor padarao tb na classe, agora a mesma tb pode ser instanciada com valores padrao.
		//ProdutoSobrecarga produto = new ProdutoSobrecarga();
		
		System.out.println("Preencha os dados do produto:");
		System.out.println("Descrição: ");
		String descricao = sc.nextLine();

		System.out.println("Preço: ");
		Double preco = sc.nextDouble();

		ProdutoSobrecarga produto = new ProdutoSobrecarga(descricao, preco);

		System.out.println(produto);

		System.out.println("");
		System.out.println("Entre com a quantidade de produtos a serem adicionados no estoque: ");
		int qtde = sc.nextInt();
		produto.adicionarProdutos(qtde);

		System.out.println("Dados do produto atualizado: ");
		System.out.println(produto);

		System.out.println("");
		System.out.println("Entre com a quantidade de produtos a serem removidos no estoque: ");

		qtde = sc.nextInt();
		produto.removerProdutos(qtde);

		System.out.println("Dados do produto atualizado: ");
		System.out.println(produto);

		sc.close();
	}

}
