import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		String nome, tratamento, estadoCivil, sexo;
		int hora = 0;

		Date dataAtual = new Date();
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat dataAtualCompleta = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat horaAtual = new SimpleDateFormat("HH");

		System.out.println("Qual seu primeiro nome?");
		nome = sc.next();

		System.out.println("Sexo: Masculino ou Feminino?");
		sexo = sc.next().toUpperCase();
		char[] s = sexo.toCharArray();

		System.out.println("Estado Civil: Solteiro(a), Casado(a) ou Divorciado(a)?");

		// .toUpperCase() em uma string, converte a mesma para caixa alta;
		estadoCivil = sc.next().toUpperCase();

		// ARMAZENAR TODOS OS CARACTERES DE UMA STRING EM UM VETOR - CONVERSAO DE STRING
		// EM CHAR
		char[] e = estadoCivil.toCharArray();

		switch (s[0]) {
		case 'M':
			switch (e[0]) {
			case 'C':
			case 'D':
			case 'S':
				tratamento = "Mr.";
				break;
			default:
				tratamento = "Sir.";
				break;
			}
			break;
		case 'F':
			switch (e[0]) {
			case 'C':
			case 'D':
				tratamento = "Mrs.";
				break;
			case 'S':
				tratamento = "Miss";
				break;
			default:
				tratamento = "Madam.";
				break;
			}
			break;
		default:
			tratamento = "Sir./Madam.";
			break;
		}

		// System.out.println(dataAtualCompleta.format(new Date()));
		System.out.println("Dados da sessão: ");
		System.out.println("Data/Hora: " + dataAtualCompleta.format(dataAtual));

		try {
			hora = Integer.parseInt(horaAtual.format(dataAtual));

		} catch (Exception ex) {
			System.out.println("Hora inválida!!!");
		}

		finally {
			if (hora < 12) {
				System.out.println("Bom dia " + tratamento + " " + nome + ", seja bem vindo!");
			} else {
				if (hora < 18) {
					System.out.println("Boa tarde " + tratamento + " " + nome + ", seja bem vindo!");
				} else {
					System.out.println("Boa noite " + tratamento + " " + nome + ", seja bem vindo!");
				}
			}

			sc.close();
		}

	}

}
