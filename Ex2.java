import java.util.Scanner;

public class Ex2 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("A soma dos dois números é: " + soma);
        
        scanner.close();
    }
}
