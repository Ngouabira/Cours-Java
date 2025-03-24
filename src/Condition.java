public class Condition {

    /*
    if (condition) {
    Code à exécuter si la condition est vraie
       }
    else {
     Code à exécuter si la condition est fausse
    }
     */

    /*
    if (condition1) {
         Code à exécuter si condition1 est vraie
        }
    else if (condition2) {
       Code à exécuter si condition2 est vraie
       }
    else {
     Code à exécuter si aucune condition n'est vraie
    }
     */

    public static void main(String[] args) {

        int age = 18;

        if(age>=18){
            System.out.println("Vous êtes majeur");
        }
        else{
            System.out.println("Vous êtes mineur");
        }



        //     switch (variable) {
        //         case valeur1:
        //             // Code à exécuter si la variable est égale à valeur1
        //             break;
        //         case valeur2:
        //             // Code à exécuter si la variable est égale à valeur2
        //             break;
        //         default:
        //             // Code à exécuter si la variable n'est pas égale à valeur1 ou valeur2
        //             break;
        //     }
        //     */


        String genre = "Feminin";

        switch (genre){

            case  "Masculin":
                System.out.println("Vous êtes un homme");
                break;
            case  "Feminin":
                System.out.println("Vous êtes une femme");
                break;
            default:
                System.out.println("Genre inconnu!");
        }

        // exercice 1
        // Ecrire un programme qui demande à l'utilisateur de saisir son âge
        // et vérifie si il est majeur, mineur ou vieux
        // majeur : 18 ans et plus
        // mineur : moins de 18 ans
        // vieux : plus de 65 ans
    }


}
