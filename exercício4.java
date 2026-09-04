//feito por Diogo de Oliveira de Andrade 
import java.util.Scanner;

public class exercício4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite o primeiro número");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = entrada.nextInt();
        System.out.println("Digite o terceiro numero");
        int num3 = entrada.nextInt();
        System.out.println("Digite o quarto numero");
        int num4 = entrada.nextInt();
        int resultado = num1 + num2 + num3 + num4;
        System.out.printf("o resultado da soma é: %d", resultado);
        
        entrada.close();
        
    }
}