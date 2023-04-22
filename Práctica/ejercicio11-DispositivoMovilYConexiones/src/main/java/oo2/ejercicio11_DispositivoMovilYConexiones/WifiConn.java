package oo2.ejercicio11_DispositivoMovilYConexiones;

public class WifiConn implements Connection {

	private String pict;
	
	public WifiConn() {
		this.pict = "Wifi logo";
	}
	
	@Override
	public String sendData(String data, int crc) {
		return "Wifi connection";
	}

	@Override
	public String pict() {
		return this.pict;
	}
}
