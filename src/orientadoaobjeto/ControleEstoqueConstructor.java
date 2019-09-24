package orientadoaobjeto;

import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutoConstructor;

public class ControleEstoqueConstructor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Preencha os dados do produto:");
		System.out.println("Descrição: ");
		String descricao = sc.nextLine();

		System.out.println("Preço: ");
		Double preco = sc.nextDouble();

		System.out.println("Qtde no estoque: ");
		int qtde = sc.nextInt();

		ProdutoConstructor produto = new ProdutoConstructor(descricao, preco, qtde);

		System.out.println(produto);

		System.out.println("");
		System.out.println("Entre com a quantidade de produtos a serem adicionados no estoque: ");
		qtde = sc.nextInt();
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
