package desafio;

public class Main {
	public static void main(String args[]){
		// inputs para o 1)

		System.out.println("Primeiro desafio");

		Pessoa p1 = new Pessoa();
		p1.ola();

		System.out.println("Fim do primeiro desafio\n");

		// fim dos inputs da 1)

		//inputs para o 2)

		System.out.println("Segundo desafio");

		Calculadora n1 = new Calculadora();
		System.out.println(n1.dobro(3));

		System.out.println("Fim do segundo desafio\n");
		//fim dos inputs da 2)

		//inputs para o 3)

		System.out.println("terceiro desafio");

		Musica minhaMusica = new Musica();

		minhaMusica.titulo = "Old Town Road";
		minhaMusica.artista = "Lil Nas X";
		minhaMusica.anoLancamento = 2017;
		minhaMusica.avalia(8);
		minhaMusica.avalia(7);
		minhaMusica.avalia(10);
		minhaMusica.avalia(8);
		minhaMusica.exibeFicha();

		System.out.println(minhaMusica.mediaAvaliacoes());

		System.out.println("\nfim do terceiro desafio");

		//fim dos inputs da 3)

		//inputs para o 4)

		System.out.println("quarto desafio");

		Carro carro1 = new Carro();
		carro1.modelo = "Ford Fiesta";
		carro1.ano = 2018;
		carro1.cor = "prata";

		carro1.exibeFicha();
		System.out.println("Idade:"+carro1.calculaIdade(2025));

		System.out.println("Fim do quarto desafio\n");

		//fim dos inputs da 4)

		//inputs para o 5)

		System.out.println("quinto desafio");

		Aluno novoAluno = new Aluno();
		novoAluno.nome = "José";
		novoAluno.idade = 15;

		novoAluno.exibeInfo();

		System.out.println("fim do quinto desafio");

		//fim dos inputs da 5)
	}	

}
