package atividade.java.leo.com;

public class Q3134D {
        public static void main(String[] args) {
            for (int i = 0; i <= 10; i++) {
                long fatorial = calcularFatorial(i);
                System.out.println("Fatorial de " + i + ": " + fatorial);
            }
        }

        private static long calcularFatorial(int n) {
            if (n == 0 || n == 1) {
                return 1; 
            } else {
                if (n == 2) {
                    return calcularFatorial(n - 1) * n;
                }
                return n * calcularFatorial(n - 1);
            }
        }
    }
    

