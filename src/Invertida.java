import java.util.Scanner;

public class Invertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println(invertir(frase));
    }
    public static String invertir(String palabras) {
        String[] separadas = palabras.split("\\s+");
        String aux = "";
        for (int i = separadas.length - 1; i >= 0; i--) {
            if (!separadas[i].equals(" ")) {
                aux = aux + separadas[i] + " ";
            }
        }
        return aux;
    }
}
