import java.util.Arrays;
import java.util.List;

public class S1T8N1Ex3 {

    public static void main(String[] args){


        List<String> llistaString = Arrays.asList("Gener", "Febrer", "Març", "Abril","Maig",
                "Juny", "Juliol", "Agost","Setembre","Octubre","Novembre","Desembre");
        llistaString.stream()
                .forEach(System.out::println);
    }
}
