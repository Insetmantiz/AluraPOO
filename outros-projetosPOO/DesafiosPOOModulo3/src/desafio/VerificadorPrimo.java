package desafio;


//4)
public class VerificadorPrimo extends NumerosPrimos {
	public void verificarSeEhPrimo(int numero){
		if(verificarPrimalidade(numero)){
			System.out.println(numero + "É primo");
		}else {
			System.out.println(numero + "Não é primo");
		}
	}
}
