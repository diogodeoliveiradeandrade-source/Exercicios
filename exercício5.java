//feito por Diogo de Olivera de Andrade
import java.util.Scanner;
public class exercício5 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = entrada.nextDouble();
        double media = (nota1 + nota2 + nota3) / 2;
        System.out.printf("Sua média é de : %.2f",media);
        
        entrada.close();
    }
}