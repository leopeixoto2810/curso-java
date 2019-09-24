
public class LacoForEach {

	public static void main(String[] args) {
		String[] vetor = new String[] { "Maria", "Jose", "Alex" };

		// percorrendo com um for tradicional
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		// percorrendo com for each
		for (String obj : vetor) {
			System.out.println(obj);
		}

	}

}
