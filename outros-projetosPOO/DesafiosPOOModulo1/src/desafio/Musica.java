package desafio;


//3)
public class Musica {
	String titulo;
	String artista;
	int anoLancamento;
	double avaliacao;
	int numAvaliacoes;
	
	void exibeFicha(){
		System.out.println(titulo);
		System.out.println(artista);
		System.out.println(anoLancamento);
		System.out.println(avaliacao);
		System.out.println(numAvaliacoes);
	}
	void avalia(double nota){
		avaliacao = nota + avaliacao;
		numAvaliacoes++;
	}
	double mediaAvaliacoes(){
		return avaliacao/numAvaliacoes;
	}
}
