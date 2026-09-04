//feito por Diogo de Oliveira de Andrade 
import java.util.Scanner;

public class exercicio3 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite dois numeros inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("O primeiro numero digitado foi: " + num1);
        System.out.println("O segundo numero digitado foi: " + num2);

        scanner.close();
    }
    

 
}
