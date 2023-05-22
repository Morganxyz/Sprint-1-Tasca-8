
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class S1T8N3Ex1_main {

    public static void main(String[] args){

        LinkedList<Alumne>llistaAlumnes = new LinkedList<>();

        llistaAlumnes.add(new Alumne("Freddy",20,"PHP",8.9));
        llistaAlumnes.add(new Alumne("Jack",15,"JAVA",2.8));
        llistaAlumnes.add(new Alumne("LeatherFace",22,"HTML5",7.9));
        llistaAlumnes.add(new Alumne("Jason",23,"CSS",1.9));
        llistaAlumnes.add(new Alumne("Pennywise",24,"ANGULAR",6.9));
        llistaAlumnes.add(new Alumne("Victoria",25,"C++",5.9));
        llistaAlumnes.add(new Alumne("Isabel",26,"JAVA",4.9));
        llistaAlumnes.add(new Alumne("Marion",27,"PHP",3.9));
        llistaAlumnes.add(new Alumne("Artemisa",28,"PHP",9.9));
        llistaAlumnes.add(new Alumne("Andrómeda",18,"JAVA",0.9));

    
        //Imprimir listado de nombre i edad
       llistaAlumnes.forEach(a -> System.out.println(a.getNom() + " " + a.getEdat()) );

       System.out.println("");

       //Imprimir listado de nombre y edad para los nombres que empiezan  por A
       List<Alumne> alumneList = llistaAlumnes.stream()
                                                     .filter(n -> n.getNom().startsWith("A"))
                                                             .collect(Collectors.toList());
       alumneList.forEach(a -> System.out.println(a.getNom() + " " + a.getEdat()));

        System.out.println("");

        //Imprimir nota superior a 5

        llistaAlumnes.stream()
                .filter(not -> not.getNota() > 5)
                .forEach(a -> System.out.println(a));

        System.out.println("");

        //Imprimir nota superior a 5 y no son PHP

        llistaAlumnes.stream()
                .filter(x -> x.getNota() > 5).filter(x -> x.getCurs() != "PHP")
                .forEach(a -> System.out.println(a));

        System.out.println("");

        //Imprimir mayor de 18 años y java

        llistaAlumnes.stream()
                .filter(x -> x.getCurs() == "JAVA").filter(x -> x.getEdat() >= 18)
                .forEach(b -> System.out.println(b));

    }
}
