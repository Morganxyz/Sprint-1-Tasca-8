import java.util.*;

public class S1T8N2Ex4_main {


    public static void main(String[] args){

        List <String> lista = new LinkedList<>();
        lista = new ArrayList<>(Arrays.asList("8Krüger8","Jason879","-45LeatherFace-45","798Pennywise","ElAfilador"));

        System.out.println("Sin orden");

        lista.forEach((System.out::println));

        System.out.println("");

        System.out.println("Por orden alfabético");

        lista.stream().sorted(Comparator.naturalOrder()).forEach((System.out::println));

        System.out.println("");

        System.out.println("Por orden empiezan por de 'e'");

        lista.stream().filter(x -> x.startsWith("E")).forEach(System.out::println);
        lista.stream().filter(x -> !x.startsWith("E")).forEach(System.out::println);

        System.out.println("");

        System.out.println("Reemplazando carácteres");

         lista.stream().
             forEach((x)->System.out.println( x.replaceAll("a", "4")));

        System.out.println("");










    }
}
