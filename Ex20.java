import java.util.Scanner;

public class Ex20 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo de viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();

        System.out.println("Digite a velocidade média da viagem (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempoViagem * velocidadeMedia;
        double litros = distancia / 12.0;

        System.out.printf("Quantidade de litros gastos: %.2f\n", litros);

        scanner.close();
    }
}
