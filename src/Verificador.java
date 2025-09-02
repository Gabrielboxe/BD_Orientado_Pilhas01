import java.util.*;

public class Verificador {
    public static boolean testePalindromo(String palavra){

        String palavraTratada = palavra.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < palavraTratada.length(); i++){
            pilha.push(palavraTratada.charAt(i));
        }

        StringBuilder palavraInvert = new StringBuilder();
        while (!pilha.empty()){
            palavraInvert.append(pilha.pop());
        }

        return palavraTratada.equals(palavraInvert.toString());
    }
}
