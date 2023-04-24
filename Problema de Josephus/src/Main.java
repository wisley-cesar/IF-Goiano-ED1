import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int n = 20; // número de pessoas na roda
        int m = 3; // número de pessoas a serem eliminadas em cada rodada
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }
        int index = 0;
        while (people.size() > 1) {
            index = (index + m - 1) % people.size();
            System.out.println("Eliminando pessoa de número " + people.get(index));
            people.remove(index);
        }
        System.out.println("A pessoa sobrevivente é a de número " + people.get(0));
    }

}