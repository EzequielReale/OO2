package oo2.ejercicio14_FileManager;

public class ConcreteExtensionDecorator extends FileDecorator {

	public ConcreteExtensionDecorator(FileOO2 warpee) {
		super(warpee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "\tExtension: " + this.getExtension();
	}
}
