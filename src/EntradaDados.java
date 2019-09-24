import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		char primeiraLetra;
		
		nome = sc.next();
		idade = sc.nextInt();
		altura = sc.nextDouble();
		primeiraLetra = sc.next().charAt(0);
				
		System.out.printf("Seu nome é %s, possui %d anos de idade e mede %.2f de altura.%n", nome, idade, altura);
		
		System.out.println("A primeira letra do seu nome é: " + primeiraLetra);
		sc.close();

	}

}
