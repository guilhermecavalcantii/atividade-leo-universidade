package atividade.java.leo.com;
 import java.math.BigInteger;

public class Questão5 {
   
    public static void main(String[] args) {
        calcularFatoriais(20);
        calcularFatoriais(30);
        calcularFatoriais(40);
    }

    // calcular e imprimir os fatoriais até um determinado número
    private static void calcularFatoriais(int limite) {
        for (int n = 1; n <= limite; n++) {
            BigInteger fatorial = calcularFatorial(n);
            System.out.println("Fatorial de " + n + ": " + fatorial);
        }
    }

    // calcular o fatorial de um número usando BigInteger
    private static BigInteger calcularFatorial(int n) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }
}

// Explicação do porque pode dar erro : O erro pode ocorrer devido ao estouro de capacidade dos tipos de dados primitivos em Java. Já que em java, os dados primitivos tem limites em seus valores máximos.


