public class S1T8N2Ex3_main {


    public static void main(String[] args){

        FuncInter funcInter1 = (a, b) -> (a + b);
        System.out.println("Suma : " + funcInter1.operacion(53.23f, 96.69f));

        FuncInter funcInter2 = (a, b) -> (a - b);
        System.out.println("Resta: " + funcInter2.operacion(53.23f, 96.69f));

        FuncInter funcInter3 = (a, b) -> (a * b);
        System.out.println("Multiplicación: " + funcInter3.operacion(53.23f, 96.69f));

        FuncInter funcInter4 = (a, b) -> (a / b);
        System.out.println("División: " + funcInter4.operacion(53.23f, 96.69f));

    }

    @FunctionalInterface
    interface FuncInter {
               float operacion(float a, float b);

    }

}
