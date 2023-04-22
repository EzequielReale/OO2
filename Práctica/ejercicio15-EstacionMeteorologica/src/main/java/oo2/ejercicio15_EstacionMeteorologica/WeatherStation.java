package oo2.ejercicio15_EstacionMeteorologica;

import java.util.List;

public interface WeatherStation {

	public String displayData();
	
	public double getActualFahrenheitTemperature();
	
	public double getPressure();

	public double getSolarRadiation();

	public List<Double> getFahrenheitTemperatures();
}
