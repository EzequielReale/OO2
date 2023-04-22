package oo2.ejercicio14_FileManager;

public class ConcreteModificationDateDecorator extends FileDecorator {

	public ConcreteModificationDateDecorator(FileOO2 warpee) {
		super(warpee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "\tLast modification date: " + this.getModificationDate();
	}
}
