package desafio;


//6)
public class Servico implements Vendavel{

	@Override
	public double calculaPrecoTotal(double preco, int quantidade) {
		preco = preco*quantidade;
		preco = preco + 20*quantidade; //taxa de serviço
		return preco;
	}
	
}
