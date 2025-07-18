package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
	private String apresentador;
	
	
	public String getApresentador() {
		return apresentador;
	}
	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}
	@Override
	public void exibeFichaTecnica(){
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Apresentador: " + this.getApresentador());
		System.out.println("Reproduções: " + this.getTotalReproducoes());
		System.out.println("Curtidas: " + this.getCurtidas());
		System.out.println("Classificacao: " + this.getClassificacao());
	}
	
	
	
	
	
}
