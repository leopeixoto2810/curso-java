
public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {

		double preco = 34.5;
		double desconto;

		System.out.println("Preço: " + preco);

		// Expressão tradicional
		if (preco < 20) {
			desconto = preco * 0.01;
		} else {
			desconto = preco * 0.05;
		}
		System.out.println("Expressão tradicional: ");
		System.out.println("Desconto: " + desconto);

		// Expressão ternária
		double descontoTernario = (preco < 20) ? preco * 0.01 : preco * 0.05;
		System.out.println("Expressão ternária: ");
		System.out.println("Desconto: " + desconto);
	}

}
