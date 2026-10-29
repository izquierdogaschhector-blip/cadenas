import java.util.Arrays;
import java.util.Scanner;

public class Longitud {
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.println("Y una longitud: ");
        int k = sc.nextInt();
        int palabras = 0;

        String[] separada = frase.split("\\s+");

        for (int i = 0; i < separada.length; i++) {
            if (separada[i].length() == k) {
                palabras++;
            }
        }
        System.out.println("Hay "+palabras+" palabras con una longitud de "+k+" letras.");

        public static int comprueba (int frase, int k)
    }
}
