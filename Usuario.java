package poo;

public class Usuario {

	int id;
	String nome;
	int senha;
	String permissao;
	String usuario;
	String loga;
	String cadastra;
	
	public int getid() {
		return id;
	}
	public void setid (int id ) {
		this.id  = id;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getsenha() {
		return senha;
	}
	public void setsenha (int senha) {
		this.senha  = senha;
	}
	public String getpermissao() {
		return permissao;
	}
	public void setpermissao(String permissao) {
		this.permissao = permissao;
	}
	public String getusuario() {
		return usuario;
	}
	public void setusuario(String usuario) {
		this.usuario = usuario;
	}
	public String getloga() {
		return loga;
	}
	public void setloga(String loga) {
		this.loga = loga;
	}
	public String getcadastra() {
		return cadastra;
	}
	public void setcadastra(String cadastra) {
		this.cadastra = cadastra;
	}
}
