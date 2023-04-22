package oo2.ejercicio15_EstacionMeteorologica;

public class ConcreteSolarRadiationDecorator extends WeatherStationDecorator {

	public ConcreteSolarRadiationDecorator(WeatherStation station) {
		super(station);
	}

	@Override
	public String displayData() {
		return super.displayData() + "\tRadiación solar: " + this.getSolarRadiation();
	}
}
