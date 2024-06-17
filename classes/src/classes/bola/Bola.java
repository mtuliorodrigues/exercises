package classes.bola;
import java.util.Scanner;

public class Bola {
    //Métodos da nossa classe, onde a circunferência e o material não irão mudar, então é final
    //também foram colocadas como private para não poder ser acessadas por fora, e não foi criado getters and setters,
    //pois no contexto do nosso programa, não iremos precisar.
    private String cor;
    private final double circunference;
    private final String material;

    //Criando um construtor para nossa classe exigir as informações via construtor quando for instanciada
    public Bola(String cor, double circunference, String material) {
        this.cor = cor;
        this.circunference = circunference;
        this.material = material;
    }
    //Método para fornecer todas as infos da 'Bola'
    public void getAllInfo() {
        System.out.println("Cor: " + this.cor + "\nCircunference: " + this.circunference + "\nMaterial: " + this.material);
    }
    //Método para trocar de cor, onde dentro do próprio método, colocamos nossa interação com o usuário
    public void trocaCor() {
        System.out.print("A cor da bola será trocada, qual será a nova cor: ");
        Scanner scanner = new Scanner(System.in);
        this.cor = scanner.next();
        mostraCor();
    }
    //Método criado a pedido do exercício pra poder mostrar somente a cor.
    public void mostraCor() {
        System.out.println("Cor atual da bola: " + cor);

    }


}