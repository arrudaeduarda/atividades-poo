package poo;

public class Conta {

	int id;
	String tipo;
	double saldo;
	String sacar;
	String depositar;
	
	public int getid() {
		return id;
	}
	public void setid (int id ) {
		this.id  = id;
	}
	public String gettipo() {
		return tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	public double getsaldo() {
		return saldo;
	}
	public void setsaldo (double saldo ) {
		this.saldo  = saldo;
	}
	public String getsacar() {
		return sacar;
	}
	public void setsacar(String sacar) {
		this.sacar = sacar;
	}
	public String getdepositar() {
		return depositar;
	}
	public void setdepositar(String depositar) {
		this.depositar = depositar;
	}
	
}
