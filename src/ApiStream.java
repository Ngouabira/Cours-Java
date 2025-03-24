import java.util.Arrays;

public class ApiStream {
    public static void main(String[] args) {

        int[] notes = {12, 8, 18, 10, 7, 20, 14, 9};

        //Afficher tous toutes les notes
        System.out.println("Toutes les notes:");
        Arrays.stream(notes).forEach(note -> System.out.println("Note: "+note));
        Arrays.stream(notes).forEach(System.out::println);

        System.out.println("Les notes supérieures ou égales à 10");
        Arrays.stream(notes).filter(n -> n >= 10)
                .forEach(System.out::println);

        System.out.println("Note maximale");
        int max = Arrays.stream(notes).max().orElse(0);

        System.out.println("Note minimale");
        int min = Arrays.stream(notes).min().orElse(0);

        System.out.println("La note moyenne");
        double moyenne = Arrays.stream(notes).average().orElse(0);
        System.out.println("La note moyenne est :"+moyenne);

        System.out.println("Nombre de notes supérieures ou égales à 10");
      long total=  Arrays.stream(notes).filter(n -> n >= 10).count();
        System.out.println("Le nombre total de notes supérieures ou égales à 1à est:"+total);

    }
}
