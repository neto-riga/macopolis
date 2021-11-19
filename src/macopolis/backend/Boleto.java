package macopolis.backend;
/*******************
última modificación:
	17-11-2021
*******************/


public class Boleto {
	private boolean comprado;
	private String duenio;
	private int lugar;
	
	public Boleto() {
		comprado = false;
		duenio = null;
	}
	
	public Boleto(int lugar) {
		comprado = false;
		duenio = null;
		this.lugar = lugar;
	}
	
	public boolean isComprado() {
		return comprado;
	}
	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}
	public String getDuenio() {
		return duenio;
	}
	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}
	public int getLugar() {
		return lugar;
	}

	public void setLugar(int lugar) {
		this.lugar = lugar;
	}
	
}
