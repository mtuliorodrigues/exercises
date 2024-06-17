package classes.quadrado;

public class Quadrado {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public void mudarValorLado(int novoValorLado){
        this.lado = novoValorLado;
        System.out.println("Valor do Lado alterado, novo valor: " + lado);
    }
    public void retornarValorLado(){
        System.out.println("Valor atual do Lado: " + lado);
    }
    public void calcularArea(){
        int area = lado * lado;
        System.out.println("Calculo da área feito, resultado: " + area);
    }
}
