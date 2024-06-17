package classes.bola;

public class MainApp {
    public static void main(String[] args) {
        Bola novaBola = new Bola(
                "preta",
                70.00,
                "latex"
        );

        novaBola.getAllInfo();
        novaBola.mostraCor();
        novaBola.trocaCor();
        novaBola.getAllInfo();
    }
}
