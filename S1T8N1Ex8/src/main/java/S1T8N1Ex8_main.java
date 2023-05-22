public class S1T8N1Ex8_main {

    public static void main(String[] args){

        String x = "Nombre de la Cia: Sicarios S.A.";

        FuncInter stringReverse = invertir();

        System.out.println(stringReverse.reverse(x));
    }

        public static FuncInter invertir() {

            FuncInter func = (str) -> {
                String stringInvertido = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    stringInvertido += str.charAt(i);
                }
                return stringInvertido;
            };
            return func;

        }
}
