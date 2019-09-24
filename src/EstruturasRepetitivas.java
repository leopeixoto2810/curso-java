import java.util.Scanner;

public class EstruturasRepetitivas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inicio do aprendizado sobre WHILE...");
		
		System.out.println("Digite uma sequencia de numeros:");
		int x = sc.nextInt();
		int somaWhile = 0;
		while (x != 0) {
			somaWhile += x;
			x = sc.nextInt();

		}
		System.out.println("x: " + x);
		System.out.println("soma: " + somaWhile);
		System.out.println("Fim do aprendizado sobre WHILE...");
		System.out.println("");

		System.out.println("Iniciando o aprendizado sobre FOR...");

		// numero de vezes que será executado o loop
		System.out.println("Digite o total de numeros a serem informados e em seguida digite-os para computar a soma:");
		int n = sc.nextInt();
		int somaFor = 0;
		
		for (int i = 0; i < n; i++) {
			int y = sc.nextInt();
			somaFor = somaFor + y;
		}

		System.out.println("n: " + n);
		System.out.println("soma: " + somaFor);

		System.out.println("Fim do aprendizado sobre FOR...");
		System.out.println("");

		System.out.println("Iniciando o aprendizado sobre DO WHILE...");
		char resposta;

		do {
			System.out.println("Digite a temperatura em Celcius: ");
			double tempC = sc.nextDouble();
			double tempF = (((9 * tempC) / 5) + 32);
			System.out.printf("%.2f ºC em Fahrenheit é: %.2f ºF.%n", tempC, tempF);
			System.out.println("Deseja fazer um nova conversão? (S/N)");
			resposta = sc.next().toUpperCase().charAt(0);

		} while (resposta != 'N');


		System.out.println("Fim do aprendizado sobre DO WHILE...");
		System.out.println("");
		sc.close();
	}

}
