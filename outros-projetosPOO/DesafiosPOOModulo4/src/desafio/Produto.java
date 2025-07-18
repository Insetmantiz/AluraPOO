package desafio;


//6)
public class Produto implements Vendavel {
double desconto;
	@Override
	public double calculaPrecoTotal(double preco,int quantidade) {
		desconto = preco*((quantidade/preco)*3);
		preco = preco*quantidade; //300
		preco = preco - desconto;
		
		return preco;
	}
	
}
