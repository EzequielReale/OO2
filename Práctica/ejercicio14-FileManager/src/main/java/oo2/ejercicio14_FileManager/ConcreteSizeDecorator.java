package oo2.ejercicio14_FileManager;

public class ConcreteSizeDecorator extends FileDecorator {

	public ConcreteSizeDecorator(FileOO2 warpee) {
		super(warpee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "\tSize: " + this.getSize() + "KiB";
	}
}
