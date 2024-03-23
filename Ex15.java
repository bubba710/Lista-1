import java.util.Scanner;

public class Ex15 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite x1: ");
        int x1 = scanner.nextInt();
        
        System.out.print("Digite y1: ");
        int y1 = scanner.nextInt();
        
        System.out.print("Digite x2: ");
        int x2 = scanner.nextInt();
        
        System.out.print("Digite y2: ");
        int y2 = scanner.nextInt();
        
        int distancia = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        
        System.out.println("Distância: " + distancia);
        
        scanner.close();
    }
}
