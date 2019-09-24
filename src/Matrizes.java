import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho da matriz:");
		int n = sc.nextInt();

		// sintax para array bidimensional (Matriz)
		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}

		}

		System.out.println("Diagonal Principal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i] + " ");
		}

		// matriz.length tamanho da matriz
		// matriz[i].length tamanho de colunas da primeira linha
		System.out.println("Números negativos na matriz:");
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					System.out.println(matriz[i][j]);
					count++;
				}
			}
		}
		System.out.println("Total: " + count);
		sc.close();
	}

}
