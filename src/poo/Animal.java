package poo;

public abstract class Animal {

    private String nom;
    private String race;
    private double poids;

    public Animal() {
    }

    public Animal(String nom, String race, double poids) {
        this.nom = nom;
        this.race = race;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void seDeplacer(){
        System.out.println("Je me déplace");
    }

    public abstract void crier();

    public void sePresenter(){
        System.out.println("Salut je suis "+ this.nom+" de la race "+this.race+" et, je pèse "+this.poids+"kg.");
    }
}
