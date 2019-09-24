import java.util.Locale;
import java.util.Scanner;

public class VetoresP1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de posi��es do vetor:");
		int n = sc.nextInt();

		// [] indica que a variavel � um vetor
		double[] vetor = new double[n];
		double soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite a altura da " + (i + 1) + "� pessoa: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		System.out.println(soma);
		double media = (soma / n);

		System.out.println("A altura m�dia entre as " + n + "pessoas �: " + media);
		sc.close();
	}

}
