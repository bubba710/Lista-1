import java.util.Scanner;

public class Ex9 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();
        
        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            if (A > B) {
                System.out.println("O número " + A + " é maior que o número " + B + ".");
            } else {
                System.out.println("O número " + B + " é maior que o número " + A + ".");
            }
        }
        
        scanner.close();
    }
}
