import java.util.Scanner;

public class Ex4 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + subtracao);
        System.out.println("A multiplicação dos números é: " + multiplicacao);
        System.out.println("A divisão dos números é: " + divisao);
        
        scanner.close();
    }
}
