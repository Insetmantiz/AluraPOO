package br.com.alura.minhasmusicas.modelos;

public class Audio {
	private String Titulo;
	private int totalReproducoes;
	private int curtidas;
	
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public int getTotalReproducoes() {
		return totalReproducoes;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public int getClassificacao() {
		if(this.getCurtidas()>=200 && this.getTotalReproducoes()>=800) {
			return 10;
		}else {
			return 7;
		}
	}
	
	public void curte() {
		this.curtidas++;
	}
	
	public void reproduz(){
		this.totalReproducoes++;
	}
	
	public void exibeFichaTecnica(){
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Reproduções: " + this.getTotalReproducoes());
		System.out.println("Curtidas: " + this.getCurtidas());
		System.out.println("Classificacao: " + this.getClassificacao());
	}
	
	
}
