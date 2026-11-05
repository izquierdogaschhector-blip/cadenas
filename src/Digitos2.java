import java.util.Scanner;

public class Digitos2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine();
        int contador = 0;

        System.out.println("Tiene "+contador+" numeros");
    }
    public static int contarNumeros (String frase){
        String[] separados = frase.split("\\s+");
        int contador = 0;
        boolean esNumero = true;
        for(int i = 0; i < separados.length; i++){
            System.out.println(separados[i]);
            String palabraActual = separados[i];
            esNumero = true;
            for (int j = 0; j < palabraActual.length(); j++) {
                if (!Character.isDigit(palabraActual.charAt(j))) {
                    esNumero = false;
                    break;

                }
            }
            if (esNumero) {
                contador++;
            }
        }
        return contador;
    }
}
