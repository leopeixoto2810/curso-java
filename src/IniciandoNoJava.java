import java.util.Locale;

public class IniciandoNoJava {

	public static void main(String[] args) {
		int x = 33;
		double y = 1.765;		
		double pvenda = 106.78451;
		
		int w,t;
		
		//dica: se digitar sysout e der um ctrl + space, vai se autocomplentar para System.out.println();
		System.out.println("Iniciando no java!!!");
		System.out.println("Exemplos de inicializa��o de variaveis e impress�o de dados:");
		

		String nome = "Leonardo Peixoto";
		
		System.out.print("Meu nome � " + nome + ", tenho " + x + " anos de idade e minha altura � ");
		System.out.printf("%.2f.%n", y);

		Locale.setDefault(Locale.US); //definir a localidade para os cados de virgula ou ponto para separa��o de casas decimais
		
		//%d = inteiro, %s = texto, %n = quebra de linha, %f = ponto flutuante, %.2f = ponto flutuante com 2 cadas decimais
		System.out.printf("Meu nome � %s, tenho %d anos de idade e minha altura � %.2f.%n", nome, x, y);

		System.out.println("Exemplos de cast em tipos de variaveis diferentes:");

		w = (int) pvenda; //exemplo de cast
		System.out.printf("Double: %.2f%nInteiro: %d%n", pvenda, w);

	}

}
