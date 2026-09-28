public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; 
        int a = 0;  
        int b = 1;  
        System.out.println("Serie de Fibonacci:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int suma = a + b; 
            a = b;            
            b = suma;         
        }
    }
}
