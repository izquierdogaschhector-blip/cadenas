import java.util.Scanner;

public class Analizar {
    public static void main(String[] args) {
        System.out.println("Introduce una palabra");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();

        System.out.println("Longitud de: "+palabra.length()+" palabras");
        System.out.println("La primera letra es: "+palabra.charAt(0));
        System.out.println("La última letra es: " +palabra.charAt(palabra.length()-1));
        System.out.println("Mayúsculas: " +palabra.toUpperCase());
        System.out.println("Minúsuculas: " +palabra.toLowerCase());
        System.out.println("Número de a: " +palabra.indexOf("a"));
    }
}
