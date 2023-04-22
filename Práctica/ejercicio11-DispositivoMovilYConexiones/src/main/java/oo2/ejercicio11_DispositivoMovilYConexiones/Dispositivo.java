package oo2.ejercicio11_DispositivoMovilYConexiones;

public class Dispositivo {

	private Ringer ringer;
	private CRCCalculator crc;
	private Display display;
	private Connection con;
	
	
	public Dispositivo() {
		this.con = new _4GConnAdapter();
		this.crc = new CRC16Calculator();
		this.display = new Display();
		this.ringer = new Ringer();
	}
	
	public String send(String data) {
		int crcResult = this.crc.crcFor(data);
		return this.con.sendData(data, crcResult);
	}
	
	public String changeCRC(CRCCalculator crc) {
		this.crc = crc;
		System.out.println("CRCCalculator changed");
		return "CRCcalculator changed";
	}
	
	public String changeConnection(Connection con) {
		this.con = con;
		this.display.showBanner(this.con.pict());
		this.ringer.ring();
		System.out.println("Connection changed");
		return "Connection changed";
	}
}
