import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" \n ==== Calculadora de Média ====  ");

        System.out.print("\nDigite o nome do aluno: ");
        String nome = sc.nextLine(); 

        System.out.print("\nDigite a primeira nota: ");
        double nota1 = sc.nextDouble();
        

        System.out.print("\nDigite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("\n Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        sc.close();

        double media = (nota1 + nota2 + nota3) / 3; 
          
        if ( media >= 7) {
            System.out.println("\nAluno: " + nome + " | Média " + String.format("%.2f", media) + " | Aprovado");
        } else if (media >= 5) { 

            System.out.println("\nAluno: " + nome + " | Média " + String.format("%.2f", media) + " | Recuperação");
        } else {
            System.out.println("\nAluno: " + nome + " | Média " + String.format("%.2f", media) + " | Reprovado");
        }
        }
    
    } 
