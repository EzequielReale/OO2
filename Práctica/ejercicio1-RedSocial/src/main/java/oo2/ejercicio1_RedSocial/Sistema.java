package oo2.ejercicio1_RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private List<Usuario> usuarios;
	
	public Sistema() {
		this.usuarios = new ArrayList<>();
	}
	
	private boolean screenNameDisponible(String screenName) {
		return !this.usuarios.stream()
				.anyMatch(u->u.esMiScreenName(screenName));
	}
	
	public int getCantidadUsuarios() {
		return this.usuarios.size();
	}
	
	public Usuario agregarUsuario(String screenName) {
		Usuario usuario = null;
		if (this.screenNameDisponible(screenName)) {
			usuario = new Usuario(screenName);
			this.usuarios.add(usuario);
		}
		return usuario;
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuario.borrarTweets();
		this.usuarios.remove(usuario);
	}
}
