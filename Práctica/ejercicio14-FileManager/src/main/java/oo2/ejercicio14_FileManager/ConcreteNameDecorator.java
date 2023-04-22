package oo2.ejercicio14_FileManager;

public class ConcreteNameDecorator extends FileDecorator {

	public ConcreteNameDecorator(FileOO2 warpee) {
		super(warpee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "\tName: " + this.getName();
	}
}
