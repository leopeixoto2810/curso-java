package orientadoaobjeto;

import java.util.Locale;
import java.util.Scanner;

import util.CalculoGeometricosVs2;

public class MembrosEstaticosVs3 {

	// o comando final serve para dizer que a variavel é uma constante
	// no java, o padrao para nomenclatura de constantes, é tudo em caixa alta e se
	// for composta, usar underline
	// Exemplo: PI , VALOR_PI, NUM_PI
	public static final double PI = 3.141259;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o raio: ");

		double raio = sc.nextDouble();
		double c = CalculoGeometricosVs2.circunferencia(raio);
		double v = CalculoGeometricosVs2.volume(raio);

		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);

		System.out.printf("Valor Pi: %.2f%n", CalculoGeometricosVs2.PI);

		sc.close();
	}

}
