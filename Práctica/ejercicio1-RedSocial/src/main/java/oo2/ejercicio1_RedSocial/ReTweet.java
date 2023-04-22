package oo2.ejercicio1_RedSocial;

public class ReTweet extends Tweet{

	private Tweet origen;

	
	public ReTweet(String texto, Tweet origen) {
		super(texto);
		this.origen = origen;
	}
}
