
public class FuncoesMatematicas {

	public static void main(String[] args) {
		double x = 3;
		double y = 4;
		double z = -5;
		double A, B, C;
		
		double delta, a, b, c, x1, x2;
		
		//Raiz quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);

		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + x + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		//Potenciação
		A = Math.pow(x, y);
		B = Math.pow(x, 2);
		C = Math.pow(5, 2);

		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		//Valor absoluto
		A = Math.abs(y);
		B = Math.abs(z);

		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		/* 
		 (alt + 251 = √, / alt + 241 = ± / alt + 30 = ▲)
		 Expressão: x = -b ± √▲ / 2a  (formula de bascara) 
		 Expressão: ▲ = b² - 4ac
		 */
		
		a = 2;
		b = 3;
		c = 4;
		
		delta = Math.pow(b, 2) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b + Math.sqrt(delta)) / (2 * a);

	}

}
