import java.util.Scanner;

public class LongitudII {
    public static void main(String[] args) {
        String cadena;
        System.out.println("Introduce una cadena de texto: ");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine();
        System.out.println("Introduce una longitud: ");
        int k;
        k  = sc.nextInt();
        if (comprueba(cadena, k)) {
            System.out.println("Hay alguna palabra con una longitud de "+k+" letras.");
        } else {
            System.out.println("No hay alguna palabra con una longitud de "+k+" letras.");
        }

    }
    public static boolean comprueba(String cadena, int k) {
        String[] separadas = cadena.split("\\s+");
        for (int i = 0; i < separadas.length; i++) {
            if (separadas[i].length() == k) {
                return true;
            }
        }
        return false;
    }
}
