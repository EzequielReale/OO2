package oo2.ejercicio3_MediaPlayer;

public class VideoStreamAdapter implements Media {

	private VideoStream videoStream;
		
	
	@Override
	public String play() {
		return this.videoStream.reproduce();
	}
}
