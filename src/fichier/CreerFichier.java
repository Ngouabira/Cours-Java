package fichier;

import java.io.File;
import java.io.IOException;

public class CreerFichier {

    public static void main(String[] args) throws IOException {

        File monFichier = new File("histoire.txt");

        //Création du fichier histoire.txt
        if (monFichier.createNewFile()){
            System.out.println("Fichier créé : "+ monFichier.getName());
        }
    }
}
