package cPreguntas.encontrarWord;

public class main {
    public static void main(String[] args) {
        String[] Jesus = {
                "Je***",
                "*s***",
                "*u***",
                "*s***"};

        String[] carsLujosos = {
                "c*******",
                "ar******",
                "*s*oso**",
                "*Luj*s**",
                "********",
                "********",
                "********",
                "********"};

        EncontrarPalabra find = new EncontrarPalabra();
        find.encontrar(Jesus);
        find.encontrar(carsLujosos);
    }
}
