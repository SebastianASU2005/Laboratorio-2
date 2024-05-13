package Clases;

/**
 * @author astud
 * @version 1.0
 * @created 04-abr.-2024 09:12:29
 */
public class CalculoFiscal {

	private long idCiudad;
	private int idGasto;
	private long idImpuesto;


	public CalculoFiscal(){

	}

	public CalculoFiscal(long idCiudad, int idGasto, long idImpuesto) {
		this.idCiudad = idCiudad;
		this.idGasto = idGasto;
		this.idImpuesto = idImpuesto;
	}

	public long getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(long idCiudad) {
		this.idCiudad = idCiudad;
	}

	public int getIdGasto() {
		return idGasto;
	}

	public void setIdGasto(int idGasto) {
		this.idGasto = idGasto;
	}

	public long getIdImpuesto() {
		return idImpuesto;
	}

	public void setIdImpuesto(long idImpuesto) {
		this.idImpuesto = idImpuesto;
	}

	public void finalize() throws Throwable {

	}

	public void calcularDeficit(){

	}

}