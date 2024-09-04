package poo;

public class Cliente {

	int id;
	String nome;
	long telefone;
	long cpf;
	long rg;
	String corre;
	String pula;
	String canta;
	String danca;
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getid() {
		return id;
	}
	public void setid (int id ) {
		this.id  = id;
	}
	public long gettelefone() {
		return telefone;
	}
	public void settelefone(long telefone ) {
		this.telefone = telefone;
	}
	public long getcpf() {
		return cpf;
	}
	public void setcpf (long cpf ) {
		this.cpf = cpf;
	}
	public long getrg() {
		return rg ;
	}
	public void setrg(long rg ) {
		this.rg = rg;
	}
	public String getcorre() {
		return corre;
	}
	public void setcorre(String corre ) {
		this.corre = corre ;
	}
	public String getcanta() {
		return canta;
	}
	public void setcanta (String canta ) {
		this.canta = canta ;
	}
	public String getdanca() {
		return danca ;
	}
	public void setdanca(String danca ) {
		this.danca = danca ;
	}
}
