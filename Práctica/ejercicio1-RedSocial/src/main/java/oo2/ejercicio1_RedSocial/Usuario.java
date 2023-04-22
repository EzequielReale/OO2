package oo2.ejercicio1_RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<>();
	}
	
	public boolean esMiScreenName(String screenName) {
		return this.screenName.equals(screenName);
	}
	
	public void agregarTweet(Tweet tweet) {
		this.tweets.add(tweet);
	}
	
	public void borrarTweets() {
		this.tweets.clear();
	}
	
	private boolean cantidadCaracteresOK(String texto) {
		return !texto.isEmpty() && texto.length() <= 280;
	}
	
	public int getCantidadTweets() {
		return this.tweets.size();
	}
	
	public Tweet twittear(String texto) {
		Tweet tweet = null;
		
		if (this.cantidadCaracteresOK(texto)) {
			tweet = new Tweet(texto);
			this.agregarTweet(tweet);
		}
		return tweet;
	}
	
	public Tweet retwittear(String texto, Tweet origen) {
		Tweet tweet = null;
		
		if (this.cantidadCaracteresOK(texto)) {
			tweet = new ReTweet(texto, origen);
			this.agregarTweet(tweet);
		}
		return tweet;
	}
}
