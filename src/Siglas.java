import java.util.Scanner;

public class Siglas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] separados = frase.split("\\s+");
        for(int i = 0; i < separados.length; i++){
            if (Character.isUpperCase(separados[i].charAt(0))) {
                System.out.println(separados[i].charAt(0) + "" + separados[i + i].charAt(0));
            }
        }
    }
}
