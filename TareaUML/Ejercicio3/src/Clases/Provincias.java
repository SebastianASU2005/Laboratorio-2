package Clases;

/**
 * @author astud
 * @version 1.0
 * @created 04-abr.-2024 09:12:43
 */
public class Provincias {

	private long id;
	private String nombre;
	public Ciudad m_Ciudad;
	public Informe m_Informe;

	public Provincias(){

	}

	public Provincias(long id, String nombre, Ciudad m_Ciudad, Informe m_Informe) {
		this.id = id;
		this.nombre = nombre;
		this.m_Ciudad = m_Ciudad;
		this.m_Informe = m_Informe;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getM_Ciudad() {
		return m_Ciudad;
	}

	public void setM_Ciudad(Ciudad m_Ciudad) {
		this.m_Ciudad = m_Ciudad;
	}

	public Informe getM_Informe() {
		return m_Informe;
	}

	public void setM_Informe(Informe m_Informe) {
		this.m_Informe = m_Informe;
	}

	public void finalize() throws Throwable {

	}

}