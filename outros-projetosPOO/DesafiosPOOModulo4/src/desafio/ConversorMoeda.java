package desafio;


//1)
public class ConversorMoeda implements ConversaoFinanceira {
	@Override
	public double converterDolarParaReal(double dolar) {
		
		return dolar*5.80; //onde 5.80 é a cotacao do dolar
	}
	
}
