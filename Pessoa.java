package poo;

public class Pessoa {

	
	String nome;
	int idade;
	String endereco;
	String profissao;
	int rg;
	long cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getrg() {
		return rg;
	}
	public void setrg(int rg) {
		this.rg = rg;
	}
	public long getcpf() {
		return cpf;
	}
	public void setcpf(long cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
