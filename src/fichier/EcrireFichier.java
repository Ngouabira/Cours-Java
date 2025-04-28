package fichier;

import java.io.FileWriter;
import java.io.IOException;

public class EcrireFichier {

    public static void main(String[] args) throws IOException {

        //Initialisation de FileWriter pour écrire dans un fichier
        FileWriter monFichier = new FileWriter("histoire.txt");

        //Ecriture dans le fichier histoire.txt
        monFichier.write("Il était une fois un développeur courageux ....");
        monFichier.write("\n Et il avait une bonne connaissance de Java");

        //Fermeture du fichier
        monFichier.close();
    }
}
