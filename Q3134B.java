package atividade.java.leo.com;

public class Q3134B {
        public static void main(String[] args) {
            for (int i = 0; i <= 10; i++) {
                long fatorial = calcularFatorial(i);
                System.out.println("Fatorial de " + i + ": " + fatorial);
            }
        }
    
        // Método para calcular o fatorial de um número
        private static long calcularFatorial(int n) {
            if (n == 0 || n == 1) {
                return 1; // Caso base: o fatorial de 0 e 1 é 1
            } else {
                // Caso recursivo: n! = n * (n-1)!
                return n * calcularFatorial(n - 1);
            }
        }
    }
    

