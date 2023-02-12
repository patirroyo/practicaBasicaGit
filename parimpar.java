
import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {
        sumaParesImpares();
    }
    
    public static void sumaParesImpares() {
        int sumaPares = 0;
        int sumaImpares = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingresa un número entero (%d de 10): ", i + 1);
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }
        sc.close();
        System.out.printf("El resultado: Total pares: %d; Total impares: %d", sumaPares, sumaImpares);
    }
    
    

}
