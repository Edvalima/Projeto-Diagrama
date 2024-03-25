package internet;

public class navegadorInternet {
  //Propriedade
  private String paginaAtual;

  //Método para exibir uma pagina Web
  public void exibirPagina(String url) {
    System.out.println("Exibindo página " + url);
    this.paginaAtual = url;
  }

  //Método para adicionar uma nova aba
  public void adicionarNovaAba() {
    System.out.println("Nova aba adicionada");
  }

  //Método para atualizar a página atual
  public void atualizarPagina(){
    System.out.println("Página atualizada:" + paginaAtual);
  }

  //Método para solicitar uma URL ao usuário
  public String solicitarURL() {
    //Para o exemplo irei retornar uma URL fixa
    return "https://www.exemplo.com";
  }

  //Método Getters e Setters
  public String getPaginaAtual() {
    return paginaAtual;
  }
  
  public void setPaginaAtual(String paginaAtual) {
    this.paginaAtual = paginaAtual;
  }
}
