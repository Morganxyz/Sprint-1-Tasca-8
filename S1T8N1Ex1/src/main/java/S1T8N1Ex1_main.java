
import java.util.Arrays;
import java.util.List;


public class S1T8N1Ex1_main {

    public static void main(String[] args){


        List<String> llistaString = Arrays.asList("Jason", "Krüger", "LeatherFace", "Pennywise");
        llistaString.stream().filter(name-> name.contains("o")).forEach(System.out::println);

    }
}
