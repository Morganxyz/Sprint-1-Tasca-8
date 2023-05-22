
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class S1T8N2Ex2_main {

    public static void main(String[] args) {

        List<Integer> llista = new LinkedList<Integer>();
        llista = Arrays.asList(5, 8, 9, 5, 2, 8, 87, 65, 64, 8, 8, 97, 54, 6, 68, 684, 666);

       System.out.println("");

      getLlistaC(llista);

    }

    public static void getLlistaC(List<Integer> l) {


        l.forEach((x) -> System.out.println(x%2 == 0 ? "e" + x : "o" + x));

        System.out.println("");

         System.out.println(l.stream().map(String::valueOf).collect(joining(",")));

}
}






