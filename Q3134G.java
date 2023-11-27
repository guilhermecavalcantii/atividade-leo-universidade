package atividade.java.leo.com;

public class Q3134G {
        public static void main(String[] args) {
            for (int n = 1; n <= 10; n++) {
                long fatorial = calcularFatorial(n);
                System.out.println("Fatorial de " + n + ": " + fatorial);
            }
        }
    
        // calcular o fatorial de um número
        private static long calcularFatorial(int n) {
            long resultado = 1;
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
    

