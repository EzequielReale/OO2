package oo2.ejercicio3_MediaPlayer;

public class MediaPlayer {

	private Media media;
	
	
	public MediaPlayer(Media media) {
		this.media = media;
	}
	
	public String playMedia() {
		return media.play();
	}
}
