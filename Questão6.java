package atividade.java.leo.com;

public class Questão6 {
        public static void main(String[] args) {
            int limite = 100;
            imprimirFibonacci(limite);
        }
    
        private static void imprimirFibonacci(int limite) {
            int primeiro = 0;
            int segundo = 1;
            int proximo = primeiro + segundo;
    
            System.out.println("Série de Fibonacci até " + limite + ":");
    
            while (proximo <= limite) {
                System.out.print(proximo + " ");
    
                primeiro = segundo;
                segundo = proximo;
                proximo = primeiro + segundo;
            }
        }
    }
    

