//feito por Diogo de Oliveira de Andrade 
import java.util.Scanner;
public class exercicio11{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento:");
        int anoNascimento = entrada.nextInt();
        int anoAtual = 2026;
        int idade = anoAtual - anoNascimento;
        int idade2030 = 2030 - anoNascimento;
        System.out.println("Você tem: " + idade + " anos de idade ");
        System.out.println("Em 2030 você terá: " + idade2030 + " anos de idade");
        entrada.close();
    }
}