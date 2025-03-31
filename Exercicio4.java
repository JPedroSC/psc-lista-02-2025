import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();
        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();
        System.out.println("Valor a pagar: R$ " + (precoLitro * litros));
        scanner.close();
    }
}
