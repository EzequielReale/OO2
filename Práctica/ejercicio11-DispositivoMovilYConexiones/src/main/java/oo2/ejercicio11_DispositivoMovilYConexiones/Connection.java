package oo2.ejercicio11_DispositivoMovilYConexiones;

public interface Connection {

	public String sendData(String data, int crc);
	
	public String pict();
}
