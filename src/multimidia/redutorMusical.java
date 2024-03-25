package multimidia;
  
public class redutorMusical {
  //Propriedade
  private String nomeMusica;
  //Método para tocar música
  public void tocar() {
    System.out.println("Tocando Musica: " + nomeMusica);
  }
  //Método para pausar música
  public void pausar() {
    System.out.println("Pausando musica");
  }
  //Método para selecionar música
  public void selecionarMusica(String musica) {
    this.nomeMusica = musica;
    System.out.println("Musica selecionada: " + nomeMusica);
  }
  //Método para solicitar o nome da música
  public String solicitarNomeMusica() {
    return nomeMusica;
  }
  //Usando Getters e Setters 
  public String getNomeMusica() {
    return nomeMusica;
  }
  
  public void setNomeMusica(String nomeMusica) {
    this.nomeMusica = nomeMusica;
  }
}
