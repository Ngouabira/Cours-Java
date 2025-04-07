import java.util.Arrays;

public class Tableau {

    /*
    Un tableau est une structure de données qui permet de stocker plusieurs valeurs du même type sous un même nom.
     */

    public static void main(String[] args) {

        int[] nombres;
        int nombres2[] = {1, 2, 3, 4, 5};

        nombres = new int[5];

        nombres[0] = 5;
        nombres[1] = 3;
        nombres[2] = 2;
        nombres[3] = 4;
        nombres[4] = 1;

        Arrays.sort(nombres);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre :" + nombres[i]);
        }
        
        boolean test = Arrays.equals(nombres, nombres2);
        System.out.println(test);


        String[] jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

        jours[0] = "Monday";

        int j = 0;
        while (j < jours.length) {
            System.out.println("Jour " + j + " :" + jours[j]);
            j++;
        }
    }
}
