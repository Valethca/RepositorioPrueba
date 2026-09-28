public class Fibonacci {
    
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int limite = 10; 
        System.out.println("Serie de Fibonacci (Algoritmo Recursivo):");
        for (int i = 0; i < limite; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
