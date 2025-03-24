public class Fonction {

      /* En Java, les fonctions sont des blocs de code qui peuvent être appelés par
     * d'autres parties du code. Elles peuvent être utilisées pour regrouper des
            * tâches similaires, pour rendre le code plus lisible et maintenable, ou pour
     * améliorer les performances.
     */

    /*
    Syntaxe

    type_de_retour nom_fonction(paramètres){
        bloc instruction
        retourner une valeuur;
    }
     */

 static int somme(int x, int y){
     return x+y;
 }

    static void sayHelloWorld(){
     System.out.println("Hello Wordld!");
 }



    public static void main(String[] args) {

        sayHelloWorld();
        System.out.println("Le résultat est: "+somme(20,30));
    }
}
