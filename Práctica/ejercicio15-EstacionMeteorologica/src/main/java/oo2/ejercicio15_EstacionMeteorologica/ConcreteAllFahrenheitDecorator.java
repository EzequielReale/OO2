package oo2.ejercicio15_EstacionMeteorologica;

public class ConcreteAllFahrenheitDecorator extends WeatherStationDecorator {

	public ConcreteAllFahrenheitDecorator(WeatherStation station) {
		super(station);
	}

	@Override
	public String displayData() {
		return super.displayData() + "\tLista de todas las temperaturas F°: " + this.getFahrenheitTemperatures().toString();
	}
}
