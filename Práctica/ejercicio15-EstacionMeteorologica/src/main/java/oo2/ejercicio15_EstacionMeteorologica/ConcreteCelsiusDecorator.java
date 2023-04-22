package oo2.ejercicio15_EstacionMeteorologica;

public class ConcreteCelsiusDecorator extends WeatherStationDecorator {

	public ConcreteCelsiusDecorator(WeatherStation station) {
		super(station);
	}

	@Override
	public String displayData() {
		return super.displayData() + "\tTemperatura actual en C°: " + this.convertToCelsius(this.getActualFahrenheitTemperature());
	}
}
