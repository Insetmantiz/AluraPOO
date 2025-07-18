package desafio;


//3)
public class ContaBancaria {
	protected int saldo;
	
	
	public int getSaldo() {
		return saldo;
	}
	
	public void depositar(int deposito) {
		saldo = saldo + deposito;
		 System.out.println("Depósito de " + deposito + " realizado.");
	}
	
	public void sacar(int valor) {
		if (valor<=saldo){
			saldo = saldo - valor;
			 System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void verSaldo() {
		 System.out.println("Saldo atual: " + saldo);
	}
}
