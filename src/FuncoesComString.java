
public class FuncoesComString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "abcde FGHIJ ABC abc DEFG    ";

		String minusculo = texto.toLowerCase();
		String maiusculo = texto.toUpperCase();
		String semEspaco = texto.trim();
		String corteTexto = texto.substring(2);
		String corteTexto2 = texto.substring(2, 9);
		String substTexto = texto.replace('a', 'x');
		String substTexto2 = texto.replace("abc", "xy");
		int posicaoFirst = texto.indexOf("bc");
		int posicaoLast = texto.lastIndexOf("bc");

		System.out.println("Original: -" + texto + "-");
		System.out.println("toLowerCase: -" + minusculo + "-");
		System.out.println("toUpperCase: -" + maiusculo + "-");
		System.out.println("trim: -" + semEspaco + "-");
		System.out.println("substring(2): -" + corteTexto + "-");
		System.out.println("substring(2,9): -" + corteTexto2 + "-");
		System.out.println("texto.replace('a', 'x'): -" + substTexto + "-");
		System.out.println("texto.replace(\"abc\", \"xy\"): -" + substTexto2 + "-");
		System.out.println("Index of 'bc': " + posicaoFirst);
		System.out.println("Last index of 'bc': " + posicaoLast);
	}

}
