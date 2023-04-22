package oo2.ejercicio11_DispositivoMovilYConexiones;

public class _4GConnAdapter implements Connection {

	private _4GConn adaptee;
	
	public _4GConnAdapter() {
		this.adaptee = new _4GConn();
	}
	
	@Override
	public String sendData(String data, int crc) {
		return this.adaptee.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.adaptee.getSymb();
	}
}
