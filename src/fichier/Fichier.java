package fichier;

import java.io.File;
import java.util.Arrays;

public class Fichier {

    public static void main(String[] args) {

        //Liste des fichiers d'un dossier
        File dossier = new File(".");
        String[] listeFichiers = dossier.list();
        Arrays.stream(listeFichiers).forEach(System.out::println);
    }
}
