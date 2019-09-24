
public class BoxingUnboxingWrapperClasses {

	public static void main(String[] args) {

		// boxing e unboxing se tratam do conceito de passar uma variavel primitiva para
		// referencia e vice versa
		int x = 20;
		// boxing
		Object obj = x;
		System.out.println(obj);

		// unboxing
		// (int) antes da variavel obj significa um CASTING/CAST
		int y = (int) obj;

		// wrapper classes (naturalmente pode receber o valor nulo, diferente do
		// primitivo)
		// para cada tipo primitivo, existe um object de tipo referente
		// Exemplo:
		// Primitivo / Object
		// int / Integer
		// double / Double
		// char / Character

		Integer obj2 = x;
		int z = obj2;

	}

}
