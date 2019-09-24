package orientadoaobjeto;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticosVs1 {

	// o comando final serve para dizer que a variavel � uma constante
	// no java, o padrao para nomenclatura de constantes, � tudo em caixa alta e se
	// for composta, usar underline
	// Exemplo: PI , VALOR_PI, NUM_PI
	public static final double PI = 3.141259;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o raio: ");

		double raio = sc.nextDouble();
		double c = circunferencia(raio);
		double v = volume(raio);

		System.out.printf("Circunfer�ncia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);

		System.out.printf("Valor Pi: %.2f%n", PI);

		sc.close();
	}

	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}

	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}

}
