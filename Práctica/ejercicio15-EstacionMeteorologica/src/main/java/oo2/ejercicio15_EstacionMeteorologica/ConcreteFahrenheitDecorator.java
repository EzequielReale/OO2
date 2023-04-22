package oo2.ejercicio15_EstacionMeteorologica;

public class ConcreteFahrenheitDecorator extends WeatherStationDecorator {

	public ConcreteFahrenheitDecorator(WeatherStation station) {
		super(station);
	}

	@Override
	public String displayData() {
		return super.displayData() + "\tTemperatura actual en F°: " + this.getActualFahrenheitTemperature();
	}
}
