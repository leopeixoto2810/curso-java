package orientadoaobjeto;

import java.util.Locale;
import java.util.Scanner;

import util.CalculoGeometricosVs1;

public class MembrosEstaticosVs2 {

	// o comando final serve para dizer que a variavel é uma constante
	// no java, o padrao para nomenclatura de constantes, é tudo em caixa alta e se
	// for composta, usar underline
	// Exemplo: PI , VALOR_PI, NUM_PI
	public static final double PI = 3.141259;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CalculoGeometricosVs1 calc = new CalculoGeometricosVs1();

		System.out.println("Entre com o raio: ");

		double raio = sc.nextDouble();
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);

		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);

		System.out.printf("Valor Pi: %.2f%n", calc.PI);

		sc.close();
	}

}
