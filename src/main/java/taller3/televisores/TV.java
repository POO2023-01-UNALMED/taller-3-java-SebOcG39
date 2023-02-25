package taller3.televisores;

public class TV{
	static int numTV;
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	public TV(Marca mar, boolean est ) {
		this.marca = mar;
		this.estado = est;
		numTV++;
	}
	public Marca getMarca() {
		return this.marca;
	}
	public void setMarca(Marca mar) {
		this.marca = mar;
	}
	public Control getControl() {
		return this.control;
	}
	public void setControl(Control con) {
		this.control = con;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int pre) {
		this.precio = pre;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public void setVolumen(int vol) {
		this.volumen = vol;
	}
	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int can) {
		this.canal = can;
	}
	public void setNumTV(int num) {
		numTV = num;
	}
	public int getNumTV() {
		return TV.numTV;
	}
	public void turnOn() {
		if (this.estado != true) {
			this.estado = true;
		}
	}
	public void turnOff() {
		if (this.estado != false) {
			this.estado = false;
		}
	}
	public boolean getEstado() {
		return this.estado;
	}
	public void canalUp() {
		if (this.estado) {
			if (this.canal < 120) {
				this.canal++;
			}
		}
	}
	public void canalDown() {
		if (this.estado) {
			if (this.canal > 1) {
				this.canal--;
			}
		}
	}
	public void volumenUp() {
		if (this.estado) {
			if (this.volumen < 7) {
				this.volumen++;
			}
		}
	}
	public void volumenDown() {
		if (this.estado) {
			if (this.volumen > 1) {
				this.volumen--;
			}
		}
	}
	
}