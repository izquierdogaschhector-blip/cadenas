import java.util.Locale;
import java.util.Scanner;

public class Alfabetica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una palabra para saber si es alfabética o no");
        String palabra = in.nextLine();
        String letras = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, Ñ, O, P, Q, R, S, T, U, V, W, X, Y, Z";
        String[] letrasSeparadas =  letras.toLowerCase().split("\\s+");

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(0) > palabra.charAt(i)) {
                System.out.println("No es alfabética");
            } else  {
                System.out.println("Es alfabética");
            }
        }
    }
}
