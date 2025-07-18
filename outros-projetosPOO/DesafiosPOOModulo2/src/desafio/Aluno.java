package desafio;


//4)

public class Aluno {
	private String nome;
	private double notas;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	public double calcularMedia(double numProvas){
		return notas=notas/numProvas;
	}
	
}
