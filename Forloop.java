import java.util.ArrayList;
import java.util.List;

public class Forloop {
    public static void main(String[] args) {
       List<String> nomes = new ArrayList<>();
       nomes.add("Bruno");
       nomes.add("Tiktok");
       nomes.add("Aprendendo Java");
       for(int i = 0; i < nomes.size(); i++) {
        System.out.println(nomes);
       }
    }
}