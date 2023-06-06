public class Producto {
	private String _nombre;
	private categoria _categoria;
	private tamano _tamano;
	private float _precio;

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public categoria getCategoria() {
		return this._categoria;
	}

	public void setCategoria(categoria aCategoria) {
		this._categoria = aCategoria;
	}

	public tamano getTamano() {
		return this._tamano;
	}

	public void setTamano(tamano aTamano) {
		this._tamano = aTamano;
	}

	public float getPrecio() {
		return this._precio;
	}

	public void setPrecio(float aPrecio) {
		this._precio = aPrecio;
	}
}