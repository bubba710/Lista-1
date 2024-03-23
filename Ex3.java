import java.util.Scanner;

public class Ex3 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();
        
        if (A > B) {
            System.out.println("O maior número é: " + A);
        } else if (B > A) {
            System.out.println("O maior número é: " + B);
        } else {
            System.out.println("A sequência de números informada é inválida, pois ambos são iguais.");
        }
        
        scanner.close();
    }
}

