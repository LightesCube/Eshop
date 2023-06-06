public class Cliente {
	private String _nombre;
	private String _direccion;
	private String _rs;
	public Cuenta _cuenta;
	public UsuarioWeb _unnamed_UsuarioWeb_;

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getDireccion() {
		return this._direccion;
	}

	public void setDireccion(String aDireccion) {
		this._direccion = aDireccion;
	}

	public String getRs() {
		return this._rs;
	}

	public void setRs(String aRs) {
		this._rs = aRs;
	}

}