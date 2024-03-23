import java.util.Scanner;

public class Ex14 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro termo (a1): ");
        int a1 = scanner.nextInt();
        
        System.out.println("Digite o número do termo desejado (n): ");
        int n = scanner.nextInt();
        
        System.out.println("Digite a razão (r): ");
        int r = scanner.nextInt();
        
        int an = a1 + (n - 1) * r;
        
        System.out.println("O " + n + "-ésimo termo é: " + an);
        
        scanner.close();
    }
}
