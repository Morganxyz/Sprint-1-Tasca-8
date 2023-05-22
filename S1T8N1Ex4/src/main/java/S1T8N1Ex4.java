
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class S1T8N1Ex4 {


    public static void main(String[] args){


        List<String> llistaString = Arrays.asList("Gener", "Febrer", "Març", "Abril","Maig",
                "Juny", "Juliol", "Agost","Setembre","Octubre","Novembre","Desembre");

        Consumer<List> consumer = (x -> System.out.println(x));

        consumer.accept(llistaString);
    }
}
