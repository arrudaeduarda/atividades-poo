package poo;

public class ObjetoCarro {

	public static void main(String[] args) {
		// Criando objetos da classe carro
		Carros carros1 = new Carros ();
		Carros carros2 = new Carros ();
		Carros carros3 = new Carros ();
		Carros carros4 = new Carros ();

		//Objeto 1
		carros1.setmarca("Fusca");
		carros1.setano(2015);
		carros1.setcor("vermelho");
		carros1.setporta(4);
		carros1.setvireDireita("Sim");
		carros1.setvireEsquerda("Não");
		
		//Objeto 2
		carros2.setmarca("Parati");
		carros2.setano(2016);
		carros2.setcor("azul");
		carros2.setporta(4);
		carros2.setvireDireita("Sim");
		carros2.setvireEsquerda("Não");
		
		//Objeto 3
		carros3.setmarca("Batcarro");
		carros3.setano(2006);
		carros3.setcor("preto");
		carros3.setporta(2);
		carros3.setvireDireita("Sim");
		carros3.setvireEsquerda("Não");
		
		//Objeto 4
		carros4.setmarca("Brasília");
		carros4.setano(1988);
		carros4.setcor("amarela");
		carros4.setporta(4);
		carros4.setvireDireita("Sim");
		carros4.setvireEsquerda("Não");
		
		//Chamando os objetos
		System.out.println("----- OBJETO 1 -----");
		System.out.println(carros1.getmarca());
		System.out.println(carros1.getano());
		System.out.println(carros1.getcor());
		System.out.println(carros1.getporta());
		System.out.println(carros1.getvireDireita());
		
		
		System.out.println("----- OBJETO 2 -----");
		System.out.println(carros2.getmarca());
		System.out.println(carros2.getano());
		System.out.println(carros2.getcor());
		System.out.println(carros2.getporta());
		
		System.out.println("----- OBJETO 3 -----");
		System.out.println(carros3.getmarca());
		System.out.println(carros3.getano());
		System.out.println(carros3.getcor());
		System.out.println(carros3.getporta());
		
		System.out.println("----- OBJETO 4 -----");
		System.out.println(carros4.getmarca());
		System.out.println(carros4.getano());
		System.out.println(carros4.getcor());
		System.out.println(carros4.getporta());
	}

}
