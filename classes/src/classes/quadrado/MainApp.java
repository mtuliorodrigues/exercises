package classes.quadrado;

public class MainApp {
    public static void main(String[] args) {

        Quadrado novoQuadrado = new Quadrado(8);
        novoQuadrado.retornarValorLado();
        novoQuadrado.calcularArea();
        novoQuadrado.mudarValorLado(10);
        novoQuadrado.retornarValorLado();
        novoQuadrado.calcularArea();
    }

}
