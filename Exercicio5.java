import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String[] destinos = {"Alemanha", "Portugal", "Itália"};
        
        for (String destino : destinos) {
            System.out.print("Digite o preço da viagem para " + destino + ": ");
            double preco = scanner.nextDouble();
            System.out.print("Digite a quantidade de pessoas que irão para " + destino + ": ");
            int pessoas = scanner.nextInt();
            total += preco * pessoas;
        }
        
        System.out.println("Custo total da viagem: R$ " + total);
        scanner.close();
    }
}
