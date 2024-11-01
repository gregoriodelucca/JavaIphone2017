public class Iphone {
    private Musica musica;
    private Chamada chamada;
    private Internet internet;

    public Iphone() {
        this.musica = new Musica();
        this.chamada = new Chamada();
        this.internet = new Internet();
    }

    public void tocarMusica() {
        musica.tocar();
    }

    public void pausarMusica() {
        musica.pausar();
    }

    public void pararMusica() {
        musica.parar();
    }

    public void fazerChamada(String numero) {
        chamada.ligar(numero);
    }

    public void encerrarChamada() {
        chamada.desligar();
    }

    public void acessarInternet(String url) {
        internet.conectar(url);
    }

    public void desconectarInternet() {
        internet.desconectar();
    }
}
