public class Main {
    public static void main(String[] args) {
/**
 * Para fazer a instanciação do objeto sigleton é necessario que seja usado
 * o metodo getInstance
 * */
Sigleton sigleton=Sigleton.getInstance();
Sigleton sigleton1=Sigleton.getInstance();
        System.out.println(sigleton);
        System.out.println(sigleton1);

        /**
         *
         * Pode se verificar que o valor nas duas intancias é igual por que so
         * existe uma instancia definida oelo metodo getInstance
         * */
    }
}