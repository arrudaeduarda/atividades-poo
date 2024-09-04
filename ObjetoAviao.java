package poo;

public class ObjetoAviao {
	public static void main(String[] args) {

		// Criando objetos da classe viao
		Aviaojava aviao1 = new Aviaojava ();
		Aviaojava aviao2 = new Aviaojava ();
		Aviaojava aviao3 = new Aviaojava ();
		Aviaojava aviao4 = new Aviaojava ();

		//Objeto 1
		aviao1.setmarca("Azul");
		aviao1.settipoviao("tuctuc");
		aviao1.setasas(3);
		aviao1.setvireDireita("Sim");
		aviao1.setvireEsquerda("Sim");

		//Objeto 2
		aviao2.setmarca("Gol");
		aviao2.settipoviao("helicóptero");
		aviao2.setasas(2);
		aviao2.setvireDireita("Sim");
		aviao2.setvireEsquerda("Sim");

		//Objeto 3
		aviao3.setmarca("Latam");
		aviao3.settipoviao("internacional");
		aviao3.setasas(5);
		aviao3.setvireDireita("Sim");
		aviao3.setvireEsquerda("Sim");

		//Objeto 4 
		aviao4.setmarca("Emirates");
		aviao4.settipoviao("tuctuc");
		aviao4.setasas(7);
		aviao4.setvireDireita("Sim");
		aviao4.setvireEsquerda("Sim");

		//Apresentando os objetos 

		System.out.println("----- OBJETO 1 -----");
		System.out.println(aviao1.getmarca());
		System.out.println(aviao1.getTipoaviao());
		System.out.println(aviao1.getasas());
		System.out.println(aviao1.getvireDireita());
		System.out.println(aviao1.getvireEsquerda());

		System.out.println("----- OBJETO 2 -----");
		System.out.println(aviao2.getmarca());
		System.out.println(aviao2.getTipoaviao());
		System.out.println(aviao2.getasas());
		System.out.println(aviao2.getvireDireita());
		System.out.println(aviao2.getvireEsquerda());

		System.out.println("----- OBJETO 3 -----");
		System.out.println(aviao3.getmarca());
		System.out.println(aviao3.getTipoaviao());
		System.out.println(aviao3.getasas());
		System.out.println(aviao3.getvireDireita());
		System.out.println(aviao3.getvireEsquerda());

		System.out.println("----- OBJETO 4 -----");
		System.out.println(aviao4.getmarca());
		System.out.println(aviao4.getTipoaviao());
		System.out.println(aviao4.getasas());
		System.out.println(aviao4.getvireDireita());
		System.out.println(aviao4.getvireEsquerda());

	}
}