package oo2.ejercicio14_FileManager;

public class ConcreteCreationDateDecorator extends FileDecorator {

	public ConcreteCreationDateDecorator(FileOO2 warpee) {
		super(warpee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "\tCreation date: " + this.getCreationDate();
	}
}
