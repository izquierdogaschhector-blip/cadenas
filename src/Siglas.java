import java.util.Scanner;

public class Siglas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println(siglas(frase));

    }
    public static String siglas (String frase){
        String[] separados = frase.split("\\s+");
        String aux = "";
        for(int i = 0; i < separados.length; i++){
            if (Character.isUpperCase(separados[i].charAt(0))) {
                aux = aux + separados[i].charAt(0) + "";
            }
        }
        return aux;
    }
}
