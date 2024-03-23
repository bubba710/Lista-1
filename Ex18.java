public import java.util.Scanner;

public class Ex18 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        double mediaHarmonica = 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);
        
        System.out.printf("Média harmônica: %.2f\n", mediaHarmonica);
        
        scanner.close();
    }
}
 {
    
}
