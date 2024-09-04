package poo;

public class ClientesObjeto {

	public static void main(String[] args) {
		
		//Criando obj 1
		
		Cliente cliente1 = new Cliente ();
		Cliente cliente2 = new Cliente ();
		
		//Objeto 1 
		cliente1.setnome("Aryeli");
		cliente1.setid(111111111);
		cliente1.settelefone(24357687l);
		cliente1.setcpf(4657930);
		cliente1.setrg(3456789);
		cliente1.setcorre("Sim");
		cliente1.setcanta("Sim");
		cliente1.setdanca("Sim");
		
		//Objeto 2
	
		cliente2.setnome("Kariany");
		cliente2.setid(77777777);
		cliente2.settelefone(9836426738l);
		cliente2.setcpf(437299038766l);
		cliente2.setrg(3642893);
		cliente2.setcorre("Sim");
		cliente2.setcanta("Não");
		cliente2.setdanca("Não");
		
		//Apresentando Objetos
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(cliente1.getnome());
		System.out.println(cliente1.getid());
		System.out.println(cliente1.gettelefone());
		System.out.println(cliente1.getcpf());
		System.out.println(cliente1.getrg());
		System.out.println(cliente1.getcorre());
		System.out.println(cliente1.getcanta());
		System.out.println(cliente1.getdanca());
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(cliente2.getnome());
		System.out.println(cliente2.getid());
		System.out.println(cliente2.gettelefone());
		System.out.println(cliente2.getcpf());
		System.out.println(cliente2.getrg());
		System.out.println(cliente2.getcorre());
		System.out.println(cliente2.getcanta());
		System.out.println(cliente2.getdanca());
		
		
	}

}
