import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoDatasCalendar {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date agora = new Date();
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(agora));

		Calendar cal = Calendar.getInstance();

		cal.setTime(agora);

		// adiciona na data 4 horas
		cal.add(Calendar.HOUR_OF_DAY, 4);

		agora = cal.getTime();

		System.out.println(sdf.format(agora));

		int minutes = cal.get(Calendar.MINUTE);
		// no pacote calendar, o mes começa com zero, por isso tem que adicionar mais 1
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
