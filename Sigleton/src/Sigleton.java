public class Sigleton {
    /**
     * Criação da variavel publica e estatica instance
     * */
    private static Sigleton instance;
/**
 * Criação do construtor padrap sem parametros e privado
 * */
   private Sigleton(){

   }
/**
 * Criação do metodo getInstance ele e responsavel por verificar se ja existe uma
 * instancia de Sigleton, se não existir ele cria a instancia
 * */
    public static Sigleton getInstance() {
        if (instance == null) {
            instance = new Sigleton();
        }
        return instance;
    }
}
