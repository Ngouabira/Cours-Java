package enums;

public enum Niveau {

    BAS(1), Moyen(2), ELEVE(3);

    private int valeur;

    Niveau(int valeur){
        this.valeur = valeur;
    }

    public int getValeur(){
        return valeur;
    }
}
