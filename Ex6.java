import java.util.Scanner;

public class Ex6 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
        scanner.close();
    }
}
