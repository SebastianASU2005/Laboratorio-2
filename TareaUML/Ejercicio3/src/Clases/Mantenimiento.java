package Clases;

/**
 * @author astud
 * @version 1.0
 * @created 04-abr.-2024 09:12:42
 */
public class Mantenimiento {

	private double Gastos;
	public Ciudad m_Ciudad;


	public Mantenimiento(){

	}

	public Mantenimiento(double gastos, Ciudad m_Ciudad) {
		Gastos = gastos;
		this.m_Ciudad = m_Ciudad;
	}

	public double getGastos() {
		return Gastos;
	}

	public void setGastos(double gastos) {
		Gastos = gastos;
	}

	public Ciudad getM_Ciudad() {
		return m_Ciudad;
	}

	public void setM_Ciudad(Ciudad m_Ciudad) {
		this.m_Ciudad = m_Ciudad;
	}

	public void finalize() throws Throwable {

	}

}