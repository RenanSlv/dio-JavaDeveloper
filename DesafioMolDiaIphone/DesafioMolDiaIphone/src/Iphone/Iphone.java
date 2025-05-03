package Iphone;

import Iphone.Interfaces.IAparelhoTelefonico;
import Iphone.Interfaces.INavegadorInternet;
import Iphone.Interfaces.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
    //metodos do reprodutor de musical
    public void tocar(){
        System.out.println("REPRODUZINDO MUSICA.");
    }
    public void pausar(){
        System.out.println("MUSICA PAUSADA.");
    }
    public void selecionarMusica(String musica){
        System.out.println("MUSICA SELECIONADA: " + musica);
    }

    //metodos do aparelho telefonico
    public void ligar(String numero){
        System.out.println("LIGANDO PARA O NUMERO: " + numero);
    }
    public void atender(){
        System.out.println("ATENDENDO A LIGAÇÃO.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ.");
    }

    //metodos do navegador de internet
    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR.");
    }
    public void exibirPagina(String url){
        System.out.println("EXIBINDO PAGINA: " + url);
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA.");
    }

}
