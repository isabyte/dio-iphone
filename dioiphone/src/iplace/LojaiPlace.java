package iplace;

import iphone.CelulariPhone;

public class LojaiPlace {

	public static void main(String[] args) {
		CelulariPhone iPhone = new CelulariPhone();
		
		iPhone.ligar("(45) 00000-0000");
		
		iPhone.atender();
		
		iPhone.exibirPagina("twitter.com");
		
		iPhone.adicionarNovaAba();
		
		iPhone.tocar("God's Menu");

	}

}
