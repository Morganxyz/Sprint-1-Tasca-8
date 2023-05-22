import java.util.Arrays;
import java.util.List;

public class S1T8N2Ex1_main {

    public static void main(String[] args){

        List<String> llistaNoms = Arrays.asList("Krüger","LeatherFace","Pennywise","Jason","Ana",
                                                "Anaïs");

        llistaNoms.stream()
                  .filter(n -> n.length() == 3)
                  .filter(n-> n.startsWith("A"))
                  .forEach(System.out :: println);

    }
}
