package oo2.ejercicio8_Excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {

	private String nombre, puntoDeEncuentro;
	private LocalDate inicio, fin;
	private double costo;
	private int cupoMinimo, cupoMaximo;
	private Situacion estado;
	private List<Usuario> listaDeInscriptos, listaDeEspera;
	
	
	public Excursion(String nombre, String puntoDeEncuentro, LocalDate inicio,
			LocalDate fin, double costo, int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.inicio = inicio;
		this.fin = fin;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.setEstado(new Provisoria(this));
		this.listaDeInscriptos = new ArrayList<>();
		this.listaDeEspera = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public Situacion getEstado() {
		return estado;
	}

	public int getSizeOfListaDeInscriptos() {
		return listaDeInscriptos.size();
	}

	public int getSizeOfListaDeEspera() {
		return listaDeEspera.size();
	}

	public int getFaltantesParaCupoMinimo() {
		return this.cupoMinimo - this.getSizeOfListaDeInscriptos();
	}

	public int getFaltantesParaCupoMaximo() {
		return this.cupoMaximo - this.getSizeOfListaDeInscriptos();
	}

	public List<Usuario> getListaDeInscriptos() {
		return listaDeInscriptos;
	}

	public List<Usuario> getListaDeEspera() {
		return listaDeEspera;
	}

	public void setEstado(Situacion estado) {
		this.estado = estado;
	}
	
	protected void agregarInscripto(Usuario usuario) {
		this.listaDeInscriptos.add(usuario);
	}
	
	protected void agregarEspera(Usuario usuario) {
		this.listaDeEspera.add(usuario);
	}

	public boolean estaDefinitiva() {
		return this.listaDeInscriptos.size() >= this.cupoMinimo;
	}
	
	public boolean estaLlena() {
		return this.listaDeInscriptos.size() >= this.cupoMaximo;
	}
	
	public Usuario inscribir(String nombre, String apellido, String mail) {
		Usuario usuario = new Usuario(nombre, apellido, mail);
		this.estado.inscribir(usuario);
		return usuario;
	}
	
	protected String getMailsInscriptos() {
		return this.listaDeInscriptos.stream()
				.map(i -> i.getMail())
				.reduce("", (acumulator, element) -> acumulator + "\n" + element);
	}
	
	public String obtenerInformacion() {
		return "Nombre: " + this.nombre
				+ "Costo: " + this.costo
				+ "Fecha de inicio: " + this.inicio
				+ "Fecha de fin: " + this.fin
				+ "Punto de encuentro: " + this.puntoDeEncuentro
				+ this.estado.toString();
	}
}
