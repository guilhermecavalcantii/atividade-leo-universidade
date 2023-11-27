package atividade.java.leo.com;

public class Questão3141 {
        public static void main(String[] args) {
            int limite = 100;
            imprimirFibonacci(limite);
        }
    
        // Método para calcular e imprimir os números da série de Fibonacci até passar de um limite
        private static void imprimirFibonacci(int limite) {
            int primeiro = 0;
            int segundo = 1;
    
            System.out.println("Série de Fibonacci até " + limite + ":");
    
            while (primeiro <= limite) {
                System.out.print(primeiro + " ");
    
                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
        }
    }
    

