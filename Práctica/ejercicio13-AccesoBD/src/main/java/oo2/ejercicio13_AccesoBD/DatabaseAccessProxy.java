package oo2.ejercicio13_AccesoBD;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess {

	private DatabaseRealAccess realDatabase;
	private String user, passwd;
	private boolean log;
	
	
	public DatabaseAccessProxy(String user, String passwd) {
		this.realDatabase = new DatabaseRealAccess();
		this.user = user;
		this.passwd = passwd;
		this.log = false;
	}
	
	public boolean logIn(String user, String passwd) {
		if (!((this.user == user) && (this.passwd == passwd)))throw new RuntimeException("Incorrect login");
		
		return this.log = true;
	}
	
	public void signOff() {
		this.log = false;
	}
	
	@Override
	public int insertNewRow(List<String> rowData) {
		if (!this.log) throw new RuntimeException("Access denied");
		
		return this.realDatabase.insertNewRow(rowData);
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (!this.log) throw new RuntimeException("Access denied");
		
		return this.realDatabase.getSearchResults(queryString);
	}

}
