package poo;

public class Chien extends Animal {

    private int age;

    public Chien(){}

    public Chien(String nom, String race, double poids, int age) {
        super(nom, race, poids);
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void crier() {
        System.out.println(this.getNom()+" aboie.");
    }

    @Override
    public void sePresenter() {
            System.out.println("Salut je suis "+ this.getNom()+" de la race "+this.getRace()+", j'ai "+this.age+ " et je pèse "+this.getPoids()+"kg.");
    }
}
