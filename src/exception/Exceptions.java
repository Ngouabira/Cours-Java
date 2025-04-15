package exception;

public class Exceptions {

    /*
    Une exception est un événement qui se produit lors de l'exécution d'un programme
    et qui pertube son déroulement normal. Elle signale une erreur.
     */

    //Syntaxe du bloc try catch
    /*
        try{
            instruction...
        }
        catch(ExceptionType e){
            instruction...
        }
     */

    public static void main(String[] args) throws MonException {
        System.out.println("Bonjour.");
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            System.out.println("Impossible de faire une division par zero");

        }

        test();

        System.out.println("Bonsoir.");
    }

    static void test() throws MonException {
        throw new MonException("Un exemple d'exception");
    }
}
