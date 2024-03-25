package smartphone;

import multimidia.redutorMusical;
import internet.navegadorInternet;
import meupacote.iphone;

public class smartphone {
  private redutorMusical redutorMusical;
  private navegadorInternet navegadorInternet;
  private iphone iphone;

  public smartphone() {
    redutorMusical = new redutorMusical();
    navegadorInternet = new navegadorInternet();
    iphone = new iphone();
  }

  //interagindo com o aparelho
  public void reproduzirMusica(String musica){
    redutorMusical.selecionarMusica(musica);
    redutorMusical.tocar();
  }

  public void navegarInternet(String url) {
    navegadorInternet.exibirPagina(url);
  }

  public void fazerChamada(String numero) {
    iphone.ligar();
    iphone.atenderChamada();
  }
  
  public static void main(String[] args){
    smartphone smartphone = new smartphone();
    smartphone.reproduzirMusica("Suvivor");
    smartphone.navegarInternet("https://www.exemplo.com");
    smartphone.fazerChamada("45855845");
  }
}
