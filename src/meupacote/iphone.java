package meupacote;
public class iphone {
    //Propriedades 
    private String numeroTelefone;
    @SuppressWarnings("unused")
    private String mensagemCorreioVoz;

    //Métodos para operações do aparelho
    public void ligar() {
        System.out.println("Ligando...");
    }

    public void desligar() {
        System.out.println("Desligando...");
    }
    
    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    //Solicitando o número do telefone
    public String solicitarNumeroTelefone() {
        return "88995854";
    }

    //Solicitando a mensagem de correio de voz
    public String solicitarMensagemCorreioVoz() {
        return "Você tem uma nova mensagem";
    }

    //Getters e Setters
    public String getNumeroTelefone(){
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    public String getMensagemCorreioVoz() {
        return mensagemCorreioVoz;
    }

    public void setMensagemCorreioVoz(String mensagemCorreioVoz) {
        this.mensagemCorreioVoz = mensagemCorreioVoz;
    }
}
