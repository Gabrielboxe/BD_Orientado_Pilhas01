import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a entrada para verificar palindromo: ");
        String entradaUser = scan.nextLine();

        if (Verificador.testePalindromo(entradaUser)){
            System.out.println("A entrada: '" + entradaUser + "' é um palíndromo!");
        } else {
            System.out.println("A entrada: '" + entradaUser + "' não é um palíndromo!");
        }

        scan.close();
    }
}