package Clases;


public class Informe extends CalculoFiscal {

	private Pais m_Pais;

	public Informe(){

	}

	public Informe(Pais m_Pais) {
		this.m_Pais = m_Pais;
	}

	public Informe(long idCiudad, int idGasto, long idImpuesto, Pais m_Pais) {
		super(idCiudad, idGasto, idImpuesto);
		this.m_Pais = m_Pais;
	}

	public Pais getM_Pais() {
		return m_Pais;
	}

	public void setM_Pais(Pais m_Pais) {
		this.m_Pais = m_Pais;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
 	@Override
	public void calcularDeficit(){

	}
}