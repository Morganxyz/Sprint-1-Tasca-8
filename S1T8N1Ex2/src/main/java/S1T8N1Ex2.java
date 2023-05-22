import java.util.Arrays;
import java.util.List;

public class S1T8N1Ex2 {

    public static void main(String[] args){


        List<String> llistaString = Arrays.asList("Jason", "Krügo", "LeatherFace", "Pennywise");
        llistaString.stream()
                .filter(name-> name.contains("o")).filter(lenght -> lenght.length() > 5)
                .forEach(System.out::println);

    }
}
