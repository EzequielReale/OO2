package oo2.ejercicio15_EstacionMeteorologica;

import java.util.List;

public class HomeWeatherStationAdapter implements WeatherStation {

	private HomeWeatherStation adaptee;
	
	
	public HomeWeatherStationAdapter(double temperature, double presion, double solarRadiation) {
		this.adaptee = new HomeWeatherStation(temperature, presion, solarRadiation);
	}
	
	public String displayData() {
		return "Información del clima:\n";
	}
	
	public double getActualFahrenheitTemperature() {
		return this.adaptee.getFahrenheitTemperature();
	}
	
	public double getPressure() {
		return this.adaptee.getPressure();
	}

	public double getSolarRadiation() {
		return this.adaptee.getSolarRadiation();
	}

	public List<Double> getFahrenheitTemperatures() {
		return this.adaptee.getFahrenheitTemperatures();
	}
	
	public void addFahrenheitTemperatures(double temperature) {
		this.adaptee.addFahrenheitTemperatures(temperature);
	}
}
