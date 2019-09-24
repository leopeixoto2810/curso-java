import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Jose");
		list.add("Ana");
		// essa sintax permite adicionar um elemento na lista, setando em qual posição
		// deseja-se incluir a informação
		list.add(2, "Marco");
		list.add("Leonardo");
		list.add("Luzia");
		list.add("Suzy");

		// imprimir os dados da lista usando o for each
		for (String nome : list) {
			System.out.println(nome);
		}

		System.out.println("--------------------------------------------------------------");
		// tamanho da lista
		list.size();

		// removendo passando o index
		list.remove(1);

		// removendo passando a expressão
		list.remove("Ana");

		// removendo passando um predicado
		// a expressão "nome -> nome.charAt(0) == 'M'" significa: pega o valor nome e me
		// retorna se a primeira posição da string é igual a M, se for retorna
		// verdadeiro
		list.removeIf(nome -> nome.charAt(0) == 'M');

		for (String nome : list) {
			System.out.println(nome);
		}

		System.out.println("--------------------------------------------------------------");
		// exibir a posição do item na lista
		System.out.println("Index of Leonardo: " + list.indexOf("Leonardo"));
		// caso o item não esteja na lista, o resultado será -1
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("--------------------------------------------------------------");
		// retornar somente os elementos da lista que começam com a letra "L"
		List<String> resultado = list.stream().filter(nome -> nome.charAt(0) == 'L').collect(Collectors.toList());

		for (String nome : resultado) {
			System.out.println(nome);
		}
		System.out.println("--------------------------------------------------------------");

		String primeiroResultado = list.stream().filter(nome -> nome.charAt(0) == 'L').findFirst().orElse(null);

		System.out.println(primeiroResultado);

		String primeiroResultadoNulo = list.stream().filter(nome -> nome.charAt(0) == 'R').findFirst().orElse(null);

		System.out.println(primeiroResultadoNulo);

	}

}
