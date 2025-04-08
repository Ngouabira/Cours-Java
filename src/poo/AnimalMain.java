package poo;

public class AnimalMain {

    public static void main(String[] args) {

        Animal a1 = new Animal("Sans nom", "Inconnue", 70);
        a1.sePresenter();
        a1.crier();

        System.out.println("-----------------------------------------------------------");


        Chien c1 = new Chien();
        c1.setNom("Milou");
        c1.setRace("Berger Allemand");
        c1.setPoids(70);
        c1.setAge(12);

        System.out.println("-----------------------------------------------------------");

        c1.sePresenter();
        c1.crier();

        System.out.println("-----------------------------------------------------------");

        Animal o1 = new Oiseau();
        o1.setNom("Aigle");
        o1.seDeplacer();


    }
}
