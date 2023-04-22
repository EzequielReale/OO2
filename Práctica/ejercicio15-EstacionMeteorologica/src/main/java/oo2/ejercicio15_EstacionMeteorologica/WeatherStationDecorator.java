package oo2.ejercicio15_EstacionMeteorologica;

import java.util.List;

public abstract class WeatherStationDecorator implements WeatherStation {

	private WeatherStation wrapee;
	
	
	public WeatherStationDecorator(WeatherStation station) {
		this.wrapee = station;
	}
	
	@Override
	public String displayData() {
		return this.wrapee.displayData();
	}

	@Override
	public double getActualFahrenheitTemperature() {
		return this.wrapee.getActualFahrenheitTemperature();
	}

	@Override
	public double getPressure() {
		return this.wrapee.getPressure();
	}

	@Override
	public double getSolarRadiation() {
		return this.wrapee.getSolarRadiation();
	}

	@Override
	public List<Double> getFahrenheitTemperatures() {
		return this.wrapee.getFahrenheitTemperatures();
	}
	
	double convertToCelsius(double fahrenheitTemp) {
		return (fahrenheitTemp - 32) / 1.8;
	}
}
