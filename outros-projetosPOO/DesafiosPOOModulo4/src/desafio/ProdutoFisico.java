package desafio;


//5)
public class ProdutoFisico implements Calculavel{
	double desconto = 20.0/100.0;

	@Override
	public double calcularPrecoFinal(double preco) {
		return (preco-(preco*desconto));
	}
}
