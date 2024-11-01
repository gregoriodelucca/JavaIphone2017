public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando música
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.pararMusica();

        // Testando chamadas
        iphone.fazerChamada("123456789");
        iphone.encerrarChamada();

        // Testando internet
        iphone.acessarInternet("www.exemplo.com");
        iphone.desconectarInternet();
    }
}
