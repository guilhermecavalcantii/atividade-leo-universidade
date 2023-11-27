package atividade.java.leo.com;
import java.util.Scanner;

public class Questão7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int x = scanner.nextInt();

        System.out.println("Sequência de Collatz para x = " + x + ":");
        collatzSequence(x);

        scanner.close();
    }

    
    private static void collatzSequence(int x) {
        while (x != 1) {
            System.out.print(x + " -> ");

            if (x % 2 == 0) {
                
                x /= 2;
            } else {
            
                x = 3 * x + 1;
            }
        }

        System.out.println(x);
    }
}


