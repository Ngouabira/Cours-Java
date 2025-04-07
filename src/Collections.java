import java.util.*;

public class Collections {

    public static void main(String[] args) {

        //Les array list
        //Un array list est une collection de données qui permet de stocker des données dans une liste.
        List<String> noms = new ArrayList<>();

        //Ajouter des éléments
        noms.add("Jean");
        noms.add("Pierre");
        noms.add("Marie");

        noms.stream().forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------");

        //Modifier un élément
        noms.set(0, "Paul");

        for (String nom:noms){
            System.out.println("Nom : "+nom);
        }

        System.out.println("------------------------------------------------------------------------");


        //Supprimer un élément
        noms.remove("Paul");

        noms.stream().forEach(System.out::println);


        System.out.println("------------------------------------------------------------------------");
        //Dictionnaire

        Map<String, String> pays = new HashMap<>();

        pays.put("Sénégal", "Dakar");
        pays.put("Benin", "Cotonou");
        pays.put("Togo", "Lomé");

        System.out.println(pays.get("Sénégal"));

        for (String p: pays.keySet()){
            System.out.println(p+" : "+ pays.get(p));
        }


        System.out.println("------------------------------------------------------------------------");

        // Un ensemble (Set) ne permet pas les doublons et ne garantit pas l'ordre des éléments.
        Set<String> fruits = new HashSet<>();
        fruits.add("Mangue");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.stream().forEach(System.out::println);




    }
}
