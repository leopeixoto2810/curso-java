import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutoVetor;

public class VetoresP2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de posi��es do vetor:");
		int n = sc.nextInt();

		// [] indica que a variavel � um vetor
		ProdutoVetor[] vetor = new ProdutoVetor[n];
		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();

			System.out.println("Digite a nome do " + (i + 1) + "� produto: ");
			String nome = sc.nextLine();

			System.out.println("Digite a pre�o do " + (i + 1) + "� produto: ");
			double preco = sc.nextDouble();

			vetor[i] = new ProdutoVetor(nome, preco);
			soma += vetor[i].getPreco();
		}

		double media = (soma / vetor.length);

		System.out.println("A m�dia de pre�o entre os " + n + " produtos �: " + media);
		sc.close();
	}

}
