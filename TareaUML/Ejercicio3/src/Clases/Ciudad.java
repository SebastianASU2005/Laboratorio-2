package Clases;

/**
 * @author astud
 * @version 1.0
 * @created 04-abr.-2024 09:12:34
 */
public class Ciudad {

	private int Habitantes;
	public CalculoFiscal m_CalculoFiscal;

	public Ciudad(){

	}

	public Ciudad(int habitantes, CalculoFiscal m_CalculoFiscal) {
		Habitantes = habitantes;
		this.m_CalculoFiscal = m_CalculoFiscal;
	}

	public int getHabitantes() {
		return Habitantes;
	}

	public void setHabitantes(int habitantes) {
		Habitantes = habitantes;
	}

	public CalculoFiscal getM_CalculoFiscal() {
		return m_CalculoFiscal;
	}

	public void setM_CalculoFiscal(CalculoFiscal m_CalculoFiscal) {
		this.m_CalculoFiscal = m_CalculoFiscal;
	}

	public void finalize() throws Throwable {

	}

}