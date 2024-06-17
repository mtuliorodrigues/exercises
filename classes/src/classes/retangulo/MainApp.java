package classes.retangulo;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as medidas do local.");
        System.out.print("Comprimento: ");
        int comprimentoUsuario = scanner.nextInt();

        System.out.print("largura: ");
        int larguraUsuario = scanner.nextInt();

        Retangulo novoRetangulo = new Retangulo(comprimentoUsuario,larguraUsuario);
        novoRetangulo.retornarValores();







    }
}
