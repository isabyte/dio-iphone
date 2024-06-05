package iplace;

import iphone.CelulariPhone;

public class LojaiPlace {

	public static void main(String[] args) {
		CelulariPhone iPhone = new CelulariPhone();
		
		iPhone.ligar();
		
		iPhone.atender();
		
		iPhone.exibirPagina("twitter.com");
		
		iPhone.adicionarNovaAba();
		
		iPhone.tocar("God's Menu");

	}

}
