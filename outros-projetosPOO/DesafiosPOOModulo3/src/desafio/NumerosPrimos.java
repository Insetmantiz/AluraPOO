package desafio;


//4)
public class NumerosPrimos {

	public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        int limite = (int)Math.sqrt(numero);
        
        for (int i = 2; i < limite; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
	}
	
	 public void listarPrimos(int limiteSuperior) {
	        System.out.println("Números primos até " + limiteSuperior + ": ");
	        for (int i = 2; i <= limiteSuperior; i++) {
	            if (verificarPrimalidade(i)) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();
	 }
}
