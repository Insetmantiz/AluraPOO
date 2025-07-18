package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
	public static void main (String args[]){
		Musica minhaMusica = new Musica();
		Podcast meuPodcast = new Podcast();
		
		minhaMusica.setTitulo("Você");
		minhaMusica.setCantor("Tim Maia");
		minhaMusica.setAlbum("Tim Maia 1971");
		minhaMusica.setGeneroMusical("Soul");
		minhaMusica.setDuracaoTotal(4);
		
		for(int i=0; i<1000; i++) {
			minhaMusica.reproduz();
		}
		for(int i=0; i<300; i++) {
			minhaMusica.curte();
		}
		
		meuPodcast.setTitulo("Flow Podcast");
		meuPodcast.setApresentador("Igor");
		
		for(int i=0; i<1000; i++) {
			meuPodcast.reproduz();
		}
		for(int i=0; i<300; i++) {
			meuPodcast.curte();
		}
		
		minhaMusica.exibeFichaTecnica();
		System.out.println(" ");
		System.out.println(" ");
		meuPodcast.exibeFichaTecnica();
	}

}
