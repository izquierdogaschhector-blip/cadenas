import java.util.Locale;
import java.util.Scanner;

public class Nombredeusuario {
    public static void main(String[] args) {
        System.out.println("Introduce nombre y apellidos");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        String[] partes = nombre.split("\\s+");
        String  nombreformateado = "";
        for (int i = 0; i < partes.length; i++){
            nombreformateado += partes[i].substring(0, 1).toUpperCase();
            nombreformateado += partes[i].substring(1).toLowerCase() + " ";
        }
        System.out.println("El nombre formateado es: "+nombreformateado);

        String iniciales = "";
        for (int i = 0; i < partes.length; i++) {
            iniciales += partes[i].substring(0, 1).toUpperCase() + ".";
        }
        System.out.println("Las iniciales son: "+iniciales);

        String usuario = "";
        for (int i = 0; i < partes.length; i++) {
            usuario = partes[0].substring(0, 1).toLowerCase() + partes[1].toLowerCase() + partes[2].substring(0, 1).toLowerCase();
        }
        System.out.println("El usuario es: "+usuario);
    }
}
