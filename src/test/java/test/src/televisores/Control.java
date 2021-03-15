package televisores;

public class Control {
	private TV tv;
	
	
	void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	public TV getTv() {
		return this.tv;
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
	public void canaDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal(int sCanal) {
		tv.setCanal(sCanal);
	}
	
	
	
}
