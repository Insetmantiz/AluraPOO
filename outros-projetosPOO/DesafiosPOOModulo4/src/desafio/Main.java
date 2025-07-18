package desafio;

public class Main {
	public static void main(String args[]){
		
		//inputs do primeiro desafio
		System.out.println("1)");
		ConversorMoeda moeda = new ConversorMoeda();
		System.out.println(moeda.converterDolarParaReal(80));
		System.out.println(" ");
		System.out.println(" ");

		
		//inputs do segundo desafio
		System.out.println("2)");
		CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
		System.out.println(sala.calcularArea(20, 40));
		System.out.println(sala.calcularPerimetro(20, 40));
		System.out.println(" ");
		System.out.println(" ");
		
		
		//inputs do terceiro desafio
		System.out.println("3)");
		TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
		tabuada.mostrarTabuada(5);
		System.out.println(" ");
		System.out.println(" ");
		
		
		//inputs do quarto desafio
		System.out.println("4)");
		ConversorDeTemperaturaPadrao temperatura = new ConversorDeTemperaturaPadrao();
		System.out.println(temperatura.celsiusParaFahrenheit(0));
		System.out.println(temperatura.fahrenheitParaCelsius(0));
		System.out.println(" ");
		System.out.println(" ");
		
		
		//inputs do quinto desafio
		System.out.println("5)");
		Livro livro = new Livro();
		ProdutoFisico produto = new ProdutoFisico();
		
		System.out.println(livro.calcularPrecoFinal(55)); //44
		System.out.println(produto.calcularPrecoFinal(200));//160
		System.out.println(" ");
		System.out.println(" ");
		
		
		//inputs do sexto desafio
		System.out.println("6)");
		Produto produto1 = new Produto();
		System.out.println(produto1.calculaPrecoTotal(30,10));
		Servico servico = new Servico();
		System.out.println(servico.calculaPrecoTotal(200, 2));
		
	}
}
