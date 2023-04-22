package oo2.ejercicio14_FileManager;

import java.time.LocalDate;

public class File implements FileOO2 {

	private String name, extension, permissions;
	private double size;
	private LocalDate creationDate, modificationDate;
	
	
	public File(String name, String extension, double size, LocalDate creationDate, LocalDate modificationDate,
			String permissions) {
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.creationDate = creationDate;
		this.modificationDate = modificationDate;
		this.permissions = permissions;
	}
	
	@Override
	public String prettyPrint() {
		return "File data:\n";
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getExtension() {
		return this.extension;
	}

	@Override
	public String getSize() {
		return Double.toString(this.size);
	}

	@Override
	public String getCreationDate() {
		return this.creationDate.toString();
	}

	@Override
	public String getModificationDate() {
		return this.modificationDate.toString();
	}

	@Override
	public String getPermissions() {
		return this.permissions;
	}
}
