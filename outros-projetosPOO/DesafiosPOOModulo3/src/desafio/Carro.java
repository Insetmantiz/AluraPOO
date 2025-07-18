package desafio;

//1)
public class Carro {
	private String nomeModelo;
	private double precoAno1;
	private double precoAno2;
	private double precoAno3;
	
	public void definirNome(String nome){
		nomeModelo = nome;
	}
	
	public void precoMedio(double p1,double p2,double p3){
		precoAno1 = p1;
		precoAno2 = p2;
		precoAno3 = p3;
	}
	
	public double calcularMaior(){
		double maior;
		
		maior = precoAno1;
		if(precoAno2 > maior){
			maior = precoAno2;
		}
		if(precoAno3 > maior) {
			maior = precoAno3;
		}
		
		return maior;	
	}
	
	public double calcularMenor(){
		double menor;
		
		menor = precoAno1;
		if(precoAno2 < menor){
			menor = precoAno2;
		}
		if(precoAno3 < menor){
			menor = precoAno3;
		}
		
		return menor;
	}
	
	public void exibirInfo(){
		System.out.println("Modelo" + nomeModelo);
		System.out.println("Preço médio do primeiro ano: " + precoAno1);
		System.out.println("Preço médio do segundo ano: " + precoAno2);
		System.out.println("Preço médio do terceiro ano: " + precoAno3);
		System.out.println("Maior preco: " + calcularMaior());
		System.out.println("Menor preco: " + calcularMenor());
	}
	
	
	
	
}
