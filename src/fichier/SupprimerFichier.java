package fichier;

import java.io.File;
import java.io.IOException;

public class SupprimerFichier {

    public static void main(String[] args) throws IOException {
        File monFichier = new File("histoire.txt");

        //Suppression du fichier histoire.txt
        if (monFichier.delete()){
            System.out.println("Fichier supprimé : "+ monFichier.getName());
        }
    }
}
