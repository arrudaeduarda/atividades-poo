package poo;

public class objetoPessoa {

	public static void main(String[] args) {
		//Criando objetos da classe pessoa
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		//Objeto 1
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California, USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setrg(123456789);
		pessoa1.setcpf(1234567891011l);

		//Objeto 2
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami,USA");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa2.setrg(123456789);
		pessoa2.setcpf(1234567891011l);

		//Chamando o método get() para apresentar o resultado
		System.out.println("----- OBJETO 1 -----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getrg());
		System.out.println(pessoa1.getcpf());

		System.out.println("----- OBJETO 2 -----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getrg());
		System.out.println(pessoa2.getcpf());
	}
}


