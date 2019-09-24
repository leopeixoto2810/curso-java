
public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {

		double preco = 34.5;
		double desconto;

		System.out.println("Pre�o: " + preco);

		// Express�o tradicional
		if (preco < 20) {
			desconto = preco * 0.01;
		} else {
			desconto = preco * 0.05;
		}
		System.out.println("Express�o tradicional: ");
		System.out.println("Desconto: " + desconto);

		// Express�o tern�ria
		double descontoTernario = (preco < 20) ? preco * 0.01 : preco * 0.05;
		System.out.println("Express�o tern�ria: ");
		System.out.println("Desconto: " + desconto);
	}

}
