package Clases;

/**
 * @author astud
 * @version 1.0
 * @created 04-abr.-2024 09:12:40
 */
public abstract class Impuestos {

	private long id;
	private double MontoRecaudado;
	public Ciudad m_Ciudad;

	public Impuestos(){

	}

	public Impuestos(long id, double montoRecaudado, Ciudad m_Ciudad) {
		this.id = id;
		MontoRecaudado = montoRecaudado;
		this.m_Ciudad = m_Ciudad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getMontoRecaudado() {
		return MontoRecaudado;
	}

	public void setMontoRecaudado(double montoRecaudado) {
		MontoRecaudado = montoRecaudado;
	}

	public Ciudad getM_Ciudad() {
		return m_Ciudad;
	}

	public void setM_Ciudad(Ciudad m_Ciudad) {
		this.m_Ciudad = m_Ciudad;
	}

	public void finalize() throws Throwable {

	}

	public void TotalRecaudado(){

	}

}