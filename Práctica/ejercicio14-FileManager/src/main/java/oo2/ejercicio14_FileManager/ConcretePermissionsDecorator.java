package oo2.ejercicio14_FileManager;

public class ConcretePermissionsDecorator extends FileDecorator {

	public ConcretePermissionsDecorator(FileOO2 warpee) {
		super(warpee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "\tPermissions: " + this.getPermissions();
	}
}
