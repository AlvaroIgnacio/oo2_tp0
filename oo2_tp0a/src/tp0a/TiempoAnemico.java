package tp0a;

import java.time.LocalDate;

/**
 * 
 * Clase an�mica. No tiene comportamiento, es un repositorio de datos con getters y setters.
 * Hay una clara separaci�n entre datos
 * y comportamiento al igual que en programaci�n estructurada.
 * 
 * @author Alvaro Bayon
 *
 */
public class TiempoAnemico {

	private LocalDate fecha;

	public TiempoAnemico() {
		this.fecha = LocalDate.now();
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	

}
