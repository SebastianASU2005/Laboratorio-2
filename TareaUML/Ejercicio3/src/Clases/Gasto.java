package Clases;

/**
 * @author astud
 * @version 1.0
 * @created 04-abr.-2024 09:12:36
 */
public class Gasto {

	private String detalle;
	private long id;
	private double importeGastos;
	public Impuestos m_Impuestos;

	public Gasto(){

	}

	public Gasto(String detalle, long id, double importeGastos, Impuestos m_Impuestos) {
		this.detalle = detalle;
		this.id = id;
		this.importeGastos = importeGastos;
		this.m_Impuestos = m_Impuestos;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getImporteGastos() {
		return importeGastos;
	}

	public void setImporteGastos(double importeGastos) {
		this.importeGastos = importeGastos;
	}

	public Impuestos getM_Impuestos() {
		return m_Impuestos;
	}

	public void setM_Impuestos(Impuestos m_Impuestos) {
		this.m_Impuestos = m_Impuestos;
	}

	public void finalize() throws Throwable {

	}

}