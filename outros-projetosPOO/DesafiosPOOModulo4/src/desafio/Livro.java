package desafio;


//5)
public class Livro implements Calculavel {
	double desconto = 30.0/100.0;
	double taxaDeServico;

	@Override
	public double calcularPrecoFinal(double preco) {
		taxaDeServico = preco/10;
		desconto = preco*desconto;
		return (preco-desconto)+taxaDeServico;
	}
	
	
}
