import java.util.Scanner;

public class DigitosII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase con números: ");
        String frase = input.nextLine();
        String[] separados = frase.split("\\s+");
        int suma = 0;
        boolean esNumero = false;
        String palabra = " ";
        for(int i = 0; i < separados.length; i++){
            palabra = separados[i];
        }
        for(int j = 0; j < palabra.length(); j++){
            if (!Character.isDigit(palabra.charAt(j))) {
                esNumero = true;
            }
        }
        if(!esNumero){
            suma++;
        }
    }
}
