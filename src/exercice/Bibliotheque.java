package exercice;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque {

    // Liste de livres
    private static ArrayList<String> livres = new ArrayList<>();

    // Fonction pour ajouter un livre
    public static void ajouterLivre(String titre) {
        livres.add(titre);
        System.out.println("Livre ajouté : " + titre);
    }

    // Fonction pour rechercher un livre
    public static boolean rechercherLivre(String titre) {
        return livres.contains(titre);
    }

    // Fonction pour emprunter un livre
    public static boolean emprunterLivre(String titre) {
        if (livres.contains(titre)) {
            livres.remove(titre);
            System.out.println("Livre emprunté : " + titre);
            return true;
        } else {
            System.out.println("Le livre n'est pas disponible.");
            return false;
        }
    }

    // Fonction pour retourner un livre
    public static void retournerLivre(String titre) {
        livres.add(titre);
        System.out.println("Livre retourné : " + titre);
    }

    // Fonction pour afficher la liste des livres
    public static void afficherLivres() {
        if (livres.isEmpty()) {
            System.out.println("La bibliothèque est vide.");
        } else {
            System.out.println("Livres disponibles :");
            for (String livre : livres) {
                System.out.println("- " + livre);
            }
        }
    }

    // Menu interactif
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n=== Bibliothèque ===");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Rechercher un livre");
            System.out.println("3. Emprunter un livre");
            System.out.println("4. Retourner un livre");
            System.out.println("5. Afficher la liste des livres");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // pour consommer le retour à la ligne après nextInt()

            switch (choix) {
                case 1:
                    System.out.print("Entrez le titre du livre à ajouter : ");
                    String nouveauLivre = scanner.nextLine();
                    ajouterLivre(nouveauLivre);
                    break;
                case 2:
                    System.out.print("Entrez le titre du livre à rechercher : ");
                    String recherche = scanner.nextLine();
                    if (rechercherLivre(recherche)) {
                        System.out.println("Le livre est disponible.");
                    } else {
                        System.out.println("Le livre n'est pas disponible.");
                    }
                    break;
                case 3:
                    System.out.print("Entrez le titre du livre à emprunter : ");
                    String emprunt = scanner.nextLine();
                    emprunterLivre(emprunt);
                    break;
                case 4:
                    System.out.print("Entrez le titre du livre à retourner : ");
                    String retour = scanner.nextLine();
                    retournerLivre(retour);
                    break;
                case 5:
                    afficherLivres();
                    break;
                case 0:
                    System.out.println("Fermeture du programme...");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 0);

        scanner.close();
    }

    public static void main(String[] args) {
        // Remplir la bibliothèque avec quelques livres de base
        livres.add("Mamadou et Bineta");
        livres.add("Horizon d'Afrique");

        // Lancer le menu
        menu();
    }
}
