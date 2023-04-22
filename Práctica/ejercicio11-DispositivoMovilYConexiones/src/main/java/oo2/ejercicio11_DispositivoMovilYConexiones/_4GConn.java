package oo2.ejercicio11_DispositivoMovilYConexiones;

public class _4GConn {

	private String symb;
	
	public _4GConn() {
		this.symb = "4G logo";
	}
	
	public String transmit(String data, int crc) {
		return "4G connection";
	}
	
	public String getSymb() {
		return this.symb;
	}
}
