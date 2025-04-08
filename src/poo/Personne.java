package poo;

public class Personne {

    //Attributs propriétés
    //Public Private Protected
    private String nom;
    private String prenom;
    private int age;


    //Les constructeurs
    public Personne() {}

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    //Les getters et les setters
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void sePresenter(){
        System.out.println("Nom :"+ this.getNom() + " Prénom :"+this.getPrenom()+" Age :"+this.getAge());

    }
}
