import java.util.Scanner;

public class EntreeSortie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est votre nom?");

        String nom = scanner.nextLine();

        System.out.println("Bonjour "+nom);

        //nextInt : pour lire un entier
        //nextDouble pour lire un décimal
        //nextLine pour lire une ligne complètte
        //next pour lire un mot jusqu'à un espace

    }
}
