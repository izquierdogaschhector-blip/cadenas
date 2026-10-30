import java.util.Scanner;

public class LongitudIII {
    public static void main(String[] args) {
        String cadena;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        cadena = sc.nextLine();
        System.out.println("Introduce la longitud: ");
        k = sc.nextInt();
        if (comprueba(cadena, k)) {
            System.out.println("Todas las cadenas son cortas");
        }else {
            System.out.println("Hay alguna palabra larga");
        }



    }
    public static boolean comprueba(String cadena, int k) {
        boolean saber = false;
        String[] separadas = cadena.split("\\s+");

        for (int i = 0; i < separadas.length; i++) {
            if (separadas[i].length() >= k) {
                return false;
            }
        }
        return true;
    }
}
