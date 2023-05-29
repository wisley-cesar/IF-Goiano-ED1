import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class PostoSaude {
    private static final int CAPACIDADE_ATENDIMENTO_DIARIO = 100;

    public static void main(String[] args) {
        Deque<Pessoa> filaAtendimento = new ArrayDeque<>();
        Deque<Pessoa> naoAtendidas = new ArrayDeque<>();

        // Criar grupos de 10 pessoas aleatoriamente
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int numPessoas = i + 1; // Cada grupo tem 1, 2, 3, ..., 10 pessoas
            int numNecessidadeEspecial = random.nextInt(numPessoas); // Número de pessoas com necessidade especial no grupo
            int numGestante = random.nextInt(numPessoas); // Número de gestantes no grupo
            int numLactante = random.nextInt(numPessoas); // Número de lactantes no grupo
            int numAcima60 = Math.min(3, numPessoas - numNecessidadeEspecial - numGestante - numLactante); // Número de pessoas acima de 60 anos no grupo
            int numNormal = numPessoas - numNecessidadeEspecial - numGestante - numLactante - numAcima60; // Número de pessoas com prioridade normal no grupo

            for (int j = 0; j < numPessoas; j++) {
                String sexo = (random.nextBoolean()) ? "M" : "F";
                int idade = random.nextInt(100);
                boolean gestante = (j < numGestante);
                boolean lactante = (j < numLactante);
                boolean necessidadeEspecial = (j < numNecessidadeEspecial);

                Pessoa pessoa = new Pessoa(sexo, idade, gestante, lactante, necessidadeEspecial);
                filaAtendimento.addLast(pessoa);
            }
        }

        // Atender as pessoas na fila de acordo com as prioridades
        int atendidos = 0;
        while (!filaAtendimento.isEmpty() && atendidos < CAPACIDADE_ATENDIMENTO_DIARIO) {
            Pessoa pessoa = filaAtendimento.removeFirst();

            // Verificar a prioridade da pessoa e realizar o atendimento
            if (pessoa.isGestante() || pessoa.isLactante()) {
                System.out.println("Atendimento prioritário: " + pessoa);
                atendidos++;
            } else if (pessoa.hasNecessidadeEspecial()) {
                System.out.println("Atendimento de necessidades especiais: " + pessoa);
                atendidos++;
            } else if (pessoa.getIdade() >= 60) {
                System.out.println("Atendimento para pessoa acima de 60 anos: " + pessoa);
                atendidos++;
            } else {
                naoAtendidas.addLast(pessoa);
            }
        }

        // Exibir as pessoas que não foram atendidas
        System.out.println("\nPessoas não atendidas:");
        for (Pessoa pessoa : naoAtendidas) {
            System.out.println(pessoa);
        }
    }
}