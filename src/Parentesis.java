import java.util.Scanner;

public class Parentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase para ver si esta correcta: ");
        String frase = sc.nextLine();
        if (esParentizada(frase)) {
            System.out.println("Esta bien parentizada");
        } else  {
            System.out.println("Esta mal parentizada");
        }

    }
    public static boolean esParentizada (String frase) {
        int contador = 0;
        boolean estaBien = true;
        for  (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == '(') {
                contador++;
            }
            else if(frase.charAt(i) == ')') {
                contador--;
                if (contador == -1) {
                    estaBien = false;
                }
            }
        }
        return estaBien;
    }
}
