public class Boucle {

    /*
    for(initialisation; condition; incrémentation){
        Code à exécuter;
    }
     */

     /*
     initialisation

    while(condition){     
        Code à exécuter;
        incrémentation;
    }
     */

      /*
     initialisation
    do{
        Code à exécuter;
        incrémentation;
    }while(condition)
     */

    public static void main(String[] args) {


        /*
         * Imaginons que nous avons une application qui permet d'afficher les nombres de
         * 1 à 10.
         * Pour cela, nous pouvons utiliser une boucle.
         */

        // La boucle for
        System.out.println("Avec la boucle for");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("------------------------------------");

        // La boucle while
        System.out.println("Avec la boucle while");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("------------------------------------");

        // La boucle do
        System.out.println("Avec la boucle do while");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

    }
}
