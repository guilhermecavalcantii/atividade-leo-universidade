package atividade.java.leo.com;

public class Q3134A {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            long fatorial = calcularFatorial(i);
            System.out.println("Fatorial de " + i + ": " + fatorial);
        }
    }

    
    private static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}


