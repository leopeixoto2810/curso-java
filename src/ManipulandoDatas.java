import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ManipulandoDatas {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sfData1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sfData2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		SimpleDateFormat sfData3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sfData3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date agora1 = new Date();
		Date agora2 = new Date(System.currentTimeMillis());

		// pela convensão java, o inicio começa com 0 milesegundos, o que da 01/01/1970
		Date data3 = new Date(0L);
		// criar data inicial as 5 da manha em milesegundos
		Date data4 = new Date(1000L * 60L * 60L * 5L);

		Date data1 = sfData1.parse("24/09/2019");
		Date data2 = sfData2.parse("24/09/2019 16:31:10");

		// padrao iso 8601 para datas
		Date data5 = Date.from(Instant.parse("2019-09-24T17:01:20Z"));

		System.out.println(data1);
		System.out.println(data2);

		System.out.println("Formato1: ");
		System.out.println(sfData1.format(data1));
		System.out.println(sfData1.format(data2));

		System.out.println("Formato2: ");
		System.out.println(sfData2.format(data1));
		System.out.println(sfData2.format(data2));

		System.out.println("Agora1: " + agora1);
		System.out.println("Agora2: " + agora2);

		System.out.println("Agora1 Formatado: " + sfData2.format(agora1));
		System.out.println("Agora2 Formatado: " + sfData2.format(agora2));
		System.out.println("--------------------------------------");
		System.out.println("Horario mundial, os acima são do Brasil:");

		System.out.println("Agora1 Formatado: " + sfData3.format(agora1));
		System.out.println("Agora2 Formatado: " + sfData3.format(agora2));

	}

}
