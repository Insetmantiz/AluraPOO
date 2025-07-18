package desafio;

//4)
public class Carro {
	String modelo;
	int ano;
	String cor;
	
	void exibeFicha(){
		System.out.println("Modelo:"+modelo+"\n Ano:"+ano+"\n cor:"+cor);
	}
	int calculaIdade(int anoAtual){
		return anoAtual-ano;
	}
}
