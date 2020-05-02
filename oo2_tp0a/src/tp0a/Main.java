package tp0a;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	
	public static void main(String[] args) {
		final DateTimeFormatter FORMATO_CORTO = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		final DateTimeFormatter FORMATO_LARGO = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

		TiempoAnemico tiempo = new TiempoAnemico();
		LocalDate miFecha = tiempo.getFecha();		
		System.out.println(miFecha.format(FORMATO_CORTO));
		System.out.println(miFecha.format(FORMATO_LARGO));

		TiempoNoAnemico noAnemico = new TiempoNoAnemico();
		System.out.println(noAnemico.getFechaCorta());
		System.out.println(noAnemico.getFechaLarga());
		
		LocalDate today = LocalDate.now( ZoneId.of( "America/Montreal" ) );
		System.out.println(today);
		System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
	}

}
