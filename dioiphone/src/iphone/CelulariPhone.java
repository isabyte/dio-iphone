package iphone;

import internet.NavegadorInternet;
import ipod.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class CelulariPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo " + url + " via iPhone");
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
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + " via iPhone");
		
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
	public void tocar(String musica) {
		System.out.println("Tocando " + musica + " no iPhone");
		
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
