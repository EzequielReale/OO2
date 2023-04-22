package oo2.ejercicio14_FileManager;

public abstract class FileDecorator implements FileOO2 {

	private FileOO2 warpee;
	
	public FileDecorator(FileOO2 warpee){
		this.warpee = warpee;
	}
	
	@Override
	public String prettyPrint() {
		return this.warpee.prettyPrint();
	}

	@Override
	public String getName() {
		return this.warpee.getName();
	}

	@Override
	public String getExtension() {
		return this.warpee.getExtension();
	}

	@Override
	public String getSize() {
		return this.warpee.getSize();
	}

	@Override
	public String getCreationDate() {
		return this.warpee.getCreationDate();
	}

	@Override
	public String getModificationDate() {
		return this.warpee.getModificationDate();
	}

	@Override
	public String getPermissions() {
		return this.warpee.getPermissions();
	}
}
