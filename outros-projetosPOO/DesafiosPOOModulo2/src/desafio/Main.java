package desafio;

public class Main {
	public static void main (String args[]){

		// inputs para o 1)

		ContaBancaria conta = new ContaBancaria();

		conta.setNumeroConta(123);
		conta.setSaldo(1000);
		conta.titular = "João";

		System.out.println("Número da Conta: " + conta.getNumeroConta());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Titular: " + conta.titular);

		conta.setSaldo(1500);
		System.out.println("Novo Saldo: " + conta.getSaldo());

		System.out.println(" ");
		System.out.println(" ");

		// fim dos inputs para o 1)

		// inputs para o 2)

		IdadePessoa Pessoa = new IdadePessoa();
		Pessoa.setNome("João");
		Pessoa.setIdade(20);

		System.out.println("Nome: " + Pessoa.getNome() + "\nIdade: " + Pessoa.getIdade());
		Pessoa.verificarIdade();

		System.out.println(" ");
		System.out.println(" ");
		
		// fim dos inputs para o 2)
		
		//inputs para o 3)

		Produto produto1 = new Produto();
		produto1.setNome("Cadeira de Escritório");
		produto1.setPreco(2500);

		System.out.println("Nome: " + produto1.getNome() + "\nPreco: " + produto1.getPreco());
		System.out.println("Preço com desconto de 30:" + produto1.aplicarDesconto(30));

		System.out.println(" ");
		System.out.println(" ");

		// fim dos inputs para o 3)
		
		//inputs para o 4)

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jonathan");
		aluno1.setNotas(45.5);

		System.out.println("Nome: " + aluno1.getNome() + "\nNotas: " + aluno1.getNotas());
		System.out.println("Media das notas com 6 provas feitas: " + aluno1.calcularMedia(6));

		System.out.println(" ");
		System.out.println(" ");
		
		// fim dos inputs para o 4)
		
		//inputs para o 5)

		Livro livro1 = new Livro();
		livro1.setTitulo("Diario de um Banana");
		livro1.setAutor("Jeff Kiney");

		livro1.exibirDetalhes();
		
		// fim dos inputs para o 5)
	}
}
