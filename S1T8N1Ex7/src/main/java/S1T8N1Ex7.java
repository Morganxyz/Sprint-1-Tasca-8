import java.util.Arrays;
import java.util.List;

public class S1T8N1Ex7 {


    public static void main(String[] args) {

        List<String> llistaVariada = Arrays.asList("Krüger","666","LeatherFace","Jason","8","69696969696");

        llistaVariada.sort((s1,s2) -> (s2.length() - s1.length()));
        llistaVariada.forEach(System.out::println);

    }
}
