package classes.retangulo;

public class Retangulo {
    private int comprimento, largura;
    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudarValores(int novoComprimento, int novoLargura){
        this.comprimento = novoComprimento;
        this.largura = novoLargura;
        System.out.println("Valores modificados, novos valores: " + comprimento + ", " + largura);
    }
    public void retornarValores(){
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Largura: " + largura);
    }
    public void calcularArea(){
        int area = comprimento * largura;
        System.out.println("Área calculada: " + area);
    }
    public void calcularPerimetro(){
        int perimetro = 2 * (comprimento + largura);
        System.out.println("Perímetro calculado: " + perimetro);
    }

}
