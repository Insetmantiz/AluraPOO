package desafio;

public class Main {
	public static void main(String args[]){
		
		//inputs do primeiro desafio 
		ModeloCarro carro1 = new ModeloCarro();
		carro1.definirNome("Chevrolet Onix");
		carro1.precoMedio(20000, 25000, 30000);
		carro1.exibirInfo();
		System.out.println(" ");
		System.out.println(" ");
		
		//inputs do segundo desafio
		Cachorro labrador = new Cachorro();
		labrador.emitirSom();
		labrador.abanarRabo();
		Gato siames = new Gato();
		siames.emitirSom();
		siames.arranharMoveis();
		System.out.println(" ");
		System.out.println(" ");
		
		//inputs do terceiro desafio
		 ContaBancaria conta = new ContaBancaria();
	     conta.depositar(1000);
	     conta.verSaldo();
	        

	     ContaCorrente contaCorrente = new ContaCorrente();
	     contaCorrente.depositar(200);
	     contaCorrente.cobrarTarifaMensal();
	     contaCorrente.verSaldo();
	     contaCorrente.sacar(150);
	     contaCorrente.verSaldo();
	     System.out.println(" ");
	     System.out.println(" ");
	     
	     //inputs do quarto desafio
	     VerificadorPrimo verificador = new VerificadorPrimo();
	     verificador.verificarSeEhPrimo(17);

	     GeradorPrimo gerador = new GeradorPrimo();
	     int proximoPrimo = gerador.gerarProximoPrimo(17);
	     System.out.println("O próximo primo após 17 é: " + proximoPrimo);

	     NumerosPrimos numerosPrimos = new NumerosPrimos();
	     numerosPrimos.listarPrimos(30);
	}	
}
