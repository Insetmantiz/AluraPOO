package desafio;


//4)
public class ConversorDeTemperaturaPadrao implements ConversorTemperatura {

	@Override
	public double celsiusParaFahrenheit(double celsius) {
		return (celsius * 9/5)+32;
	}

	@Override
	public double fahrenheitParaCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}

}
