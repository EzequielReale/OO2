package oo2.ejercicio15_EstacionMeteorologica;

public class ConcreteAverageCelsiusDecorator extends WeatherStationDecorator {

	public ConcreteAverageCelsiusDecorator(WeatherStation station) {
		super(station);
	}

	@Override
	public String displayData() {
		return super.displayData() + "\tTemperatura promedio en C°: " + this.getAverageCelsius();
	}
	
	private double getAverageCelsius() {
		return this.convertToCelsius(this.getFahrenheitTemperatures().stream().mapToDouble(c->c).average().orElse(0));
	}
}
