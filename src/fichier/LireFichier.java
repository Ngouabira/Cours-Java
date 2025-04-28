package fichier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LireFichier {

    public static void main(String[] args) throws FileNotFoundException {
        File monFichier = new File("histoire.txt");
        Scanner lecture = new Scanner(monFichier);
        while (lecture.hasNextLine()){
            String ligne = lecture.nextLine();
            System.out.println(ligne);
        }
    }
}
