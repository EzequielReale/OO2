package oo2.ejercicio15_EstacionMeteorologica;

public class ConcreteAverageFahrenheitDecorator extends WeatherStationDecorator {

	public ConcreteAverageFahrenheitDecorator(WeatherStation station) {
		super(station);
	}

	@Override
	public String displayData() {
		return super.displayData() + "\tPromedio en F°: " + this.getAverageFahrenheit();
	}
	
	double getAverageFahrenheit() {
		return this.getFahrenheitTemperatures().stream().mapToDouble(f->f).average().orElse(0);
	}
}
