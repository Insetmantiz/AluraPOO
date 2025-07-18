package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
	private String Album;
	private String cantor;
	private String generoMusical;
	private int duracaoTotal;
	
	public String getAlbum() {
		return Album;
	}
	public void setAlbum(String album) {
		Album = album;
	}
	public String getCantor() {
		return cantor;
	}
	public void setCantor(String cantor) {
		this.cantor = cantor;
	}
	public String getGeneroMusical() {
		return generoMusical;
	}
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
	public int getDuracaoTotal() {
		return duracaoTotal;
	}
	public void setDuracaoTotal(int duracaoTotal) {
		this.duracaoTotal = duracaoTotal;
	}
	
	@Override
	public void exibeFichaTecnica(){
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Albúm: " + this.getAlbum());
		System.out.println("Cantor: " + this.getCantor());
		System.out.println("Genero: " + this.getGeneroMusical());
		System.out.println("Reproduções: " + this.getTotalReproducoes());
		System.out.println("Curtidas: " + this.getCurtidas());
		System.out.println("Classificacao: " + this.getClassificacao());
		System.out.println("Duração: " + this.getDuracaoTotal() + "min");
	}
}
