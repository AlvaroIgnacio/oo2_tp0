package tp0a;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * 
 * Clase no anémica. Tiene comportamiento, en la clase se definen datos
 * y comportamiento como un todo.
 * 
 * @author Alvaro Bayon
 *
 */
public class TiempoNoAnemico {

	private LocalDate fecha;
	private final DateTimeFormatter FORMATO_CORTO = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
	private final DateTimeFormatter FORMATO_LARGO = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

	public TiempoNoAnemico() {
		this.fecha = LocalDate.now();
	}

	public String getFechaCorta(){
		return this.fecha.format(FORMATO_CORTO);
	}
	
	public String getFechaLarga() {
		return this.fecha.format(FORMATO_LARGO);
	}
}
