public class FamiliaDeProductos {
	private String _nombre;
	private int _cantidad;
	private type _tipo;
	private group _familia;
	public CarritoDeCompras _unnamed_CarritoDeCompras_;
	public Producto _producto;

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public int getCantidad() {
		return this._cantidad;
	}

	public void setCantidad(int aCantidad) {
		this._cantidad = aCantidad;
	}

	public type getTipo() {
		return this._tipo;
	}

	public void setTipo(type aTipo) {
		this._tipo = aTipo;
	}

	public group getFamilia() {
		return this._familia;
	}

	public void setFamilia(group aFamilia) {
		this._familia = aFamilia;
	}
}