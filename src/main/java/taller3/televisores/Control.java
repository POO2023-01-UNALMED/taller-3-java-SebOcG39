package taller3.televisores;

public class Control{
	TV tv;
	public void setTV(TV tv) {
		this.tv = tv;
	}
	public TV getTV() {
		return this.tv;
	}
	public void enlazar(TV tele) {
		this.setTV(tele);
		tele.setControl(this);
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}

	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int can) {
		tv.setCanal(can);
	}
}