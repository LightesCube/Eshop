import java.util.Vector;

public class Pedido {
	private String _comida;
	private int _tamano;
	private int _gramos;
	private float _precio;
	public Cuenta _unnamed_Cuenta_;
	public Vector<MedioPago> _unnamed_MedioPago_ = new Vector<MedioPago>();
	public CarritoDeCompras _unnamed_CarritoDeCompras_;

	public String getComida() {
		return this._comida;
	}

	public void setComida(String aComida) {
		this._comida = aComida;
	}

	public int getTamano() {
		return this._tamano;
	}

	public void setTamano(int aTamano) {
		this._tamano = aTamano;
	}

	public int getGramos() {
		return this._gramos;
	}

	public void setGramos(int aGramos) {
		this._gramos = aGramos;
	}

	public float getPrecio() {
		return this._precio;
	}

	public void setPrecio(float aPrecio) {
		this._precio = aPrecio;
	}
}