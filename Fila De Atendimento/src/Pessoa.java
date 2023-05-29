import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

class Pessoa {
    private static int idCounter = 1;

    private int id;
    private String sexo;
    private int idade;
    private boolean gestante;
    private boolean lactante;
    private boolean necessidadeEspecial;

    public Pessoa(String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial) {
        this.id = idCounter++;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
    }

    public int getId() {
        return id;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isGestante() {
        return gestante;
    }

    public boolean isLactante() {
        return lactante;
    }

    public boolean hasNecessidadeEspecial() {
        return necessidadeEspecial;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", sexo=" + sexo + ", idade=" + idade + ", gestante=" + gestante + ", lactante=" + lactante
                + ", necessidadeEspecial=" + necessidadeEspecial + "]";
    }
}
