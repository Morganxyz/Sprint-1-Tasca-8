import java.util.Arrays;
import java.util.List;

public class S1T8N1Ex6_main {

    public static void main(String[] args) {

        List<String> llistaVariada = Arrays.asList("Krüger","666","LeatherFace","Jason","8","69696969696");
        llistaVariada.sort((s1,s2) -> (s1.length() - s2.length()));
        llistaVariada.forEach(System.out::println);

        }

}


