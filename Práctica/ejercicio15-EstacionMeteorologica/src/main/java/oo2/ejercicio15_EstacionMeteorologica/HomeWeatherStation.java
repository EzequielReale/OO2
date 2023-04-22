package oo2.ejercicio15_EstacionMeteorologica;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {

	private double temperature, pressure, solarRadiation;
	private List<Double> temperatures;
	
	
	public HomeWeatherStation(double temperature, double pressure, double solarRadiation) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.solarRadiation = solarRadiation;
		this.temperatures = new ArrayList<>();
	}

	public double getFahrenheitTemperature() {
		return this.temperature;
	}
	
	public double getPressure() {
		return this.pressure;
	}

	public double getSolarRadiation() {
		return this.solarRadiation;
	}

	public List<Double> getFahrenheitTemperatures() {
		return this.temperatures;
	}
	
	public void addFahrenheitTemperatures(double temperature) {
		this.temperatures.add(temperature);
	}
}
