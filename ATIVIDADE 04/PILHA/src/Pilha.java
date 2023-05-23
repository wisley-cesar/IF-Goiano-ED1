import java.util.*;

public class Pilha {
    public static void main(String[] args) {
        String input = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        System.out.println(invertePalavras(input)); // ETSE ATSNEIC AID AOTUPMOCED EVED RELOSOR SO SMELBORP EGACILOM

        input = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";
        System.out.println(invertePalavras(input)); // FRASE SECRETAS BACHELARD ME CINCIA DA COMPUTACAO IF GOIANIA CAMPUS HINORROM E UM DOS HORMELES CURSOS DE COMPUTACAO DO ESTADO DE GOIAS
    }

    public static String invertePalavras(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                stack.push(c);
            } else {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
