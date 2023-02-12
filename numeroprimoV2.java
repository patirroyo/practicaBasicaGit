

import java.util.Scanner;

public class numeroprimoV2 {

    public static void main(String[] ARGS)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int contador,i,numero;

        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();

        contador = 0;

        for(i = 1; i <= numero; i++)
        {
            if((numero % i) == 0)
            {
                contador++;
            }
        }

        if(contador == 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
