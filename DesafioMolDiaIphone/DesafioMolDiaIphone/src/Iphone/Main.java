package Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //test reprodutor musical
        iphone.selecionarMusica("Hans Zimmer & Lisa Gerrard - We Are Free");
        iphone.tocar();
        iphone.pausar();

        //test aparelho telefonico
        iphone.ligar("999887766");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //teste navegador de internet
        iphone.exibirPagina("https://www.google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();


    }
}
