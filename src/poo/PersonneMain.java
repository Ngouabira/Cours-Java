package poo;

public class PersonneMain {

    public static void main(String[] args) {
        //Instancier ou créer un objet à partir de la classe Personne
        Personne p1 = new Personne();
        p1.setNom("PHP");
        p1.setPrenom("Laravel");
        p1.setAge(30);
        p1.sePresenter();
        System.out.println("-----------------------------------------------------------");

        Personne p2 = new Personne("Java", "Spring", 30);
        p2.sePresenter();

        System.out.println("-----------------------------------------------------------");

        p2.setNom("Python");
        p2.setPrenom("Django");
        p2.setAge(25);
        p2.sePresenter();

    }

}
