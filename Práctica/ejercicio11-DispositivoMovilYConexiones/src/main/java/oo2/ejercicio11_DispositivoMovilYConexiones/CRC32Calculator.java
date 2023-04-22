package oo2.ejercicio11_DispositivoMovilYConexiones;

import java.util.zip.CRC32;

public class CRC32Calculator implements CRCCalculator {

	@Override
	public int crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return (int) result;
	}
}
