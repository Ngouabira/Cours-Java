package poo;

public class Oiseau extends Animal{

    private String couleur;

    public Oiseau() {
    }

    public Oiseau(String nom, String race, double poids, String couleur) {
        super(nom, race, poids);
        this.couleur = couleur;
    }

    @Override
    public void seDeplacer() {
        System.out.println(this.getNom()+" vole.");
    }
}
