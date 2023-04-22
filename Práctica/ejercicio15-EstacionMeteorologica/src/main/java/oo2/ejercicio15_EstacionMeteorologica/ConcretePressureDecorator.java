package oo2.ejercicio15_EstacionMeteorologica;

public class ConcretePressureDecorator extends WeatherStationDecorator {

	public ConcretePressureDecorator(WeatherStation station) {
		super(station);
	}

	@Override
	public String displayData() {
		return super.displayData() + "\tPresión atmosférica: " + this.getPressure();
	}
}
