package iphone;

import internet.NavegadorInternet;
import ipod.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class CelulariPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página web via iPhone");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba na página web via iPhone");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página web via iPhone");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando iPhone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo iPhone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz do iPhone");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música no iPhone");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música no iPhone");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música no iPhone");
		
	}

}
