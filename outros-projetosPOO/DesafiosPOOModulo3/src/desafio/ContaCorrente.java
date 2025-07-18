package desafio;


//3)
public class ContaCorrente extends ContaBancaria {
	private int tarifaMensal = 35;
	
	public void cobrarTarifaMensal() {
		saldo -= tarifaMensal;
		 System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
	}
}
