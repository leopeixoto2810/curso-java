package orientadoaobjeto;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ControleEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();

		System.out.println("Preencha os dados do produto:");
		System.out.println("Descrição: ");
		produto.descricao = sc.nextLine();

		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();

		System.out.println("Qtde no estoque: ");
		produto.qtde = sc.nextInt();

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
