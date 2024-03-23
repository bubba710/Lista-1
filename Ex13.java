import java.util.Scanner;

public class Ex13 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        double B = scanner.nextDouble();
        
        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        
        double resultado = 0;
        
        if (operador == '+') {
            resultado = A + B;
        } else if (operador == '-') {
            resultado = A - B;
        } else if (operador == '*') {
            resultado = A * B;
        } else if (operador == '/') {
            if (B != 0) {
                resultado = A / B;
            } else {
                System.out.println("Erro: Divisão por zero.");
                return;
            }
        } else {
            System.out.println("Operador não definido.");
            return;
        }
        
        System.out.println("O resultado da operação é: " + resultado);
        
        scanner.close();
    }
}
