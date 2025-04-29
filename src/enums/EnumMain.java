package enums;

public class EnumMain {

    public static void main(String[] args) {
        Jour jour = Jour.LUNDI;

        for (Jour j : Jour.values()){
            System.out.println(j);
        }

        System.out.println("---------------------------------");

        switch (jour){

            case LUNDI :
                System.out.println("Début de la semaine");
                break;
            case VENDREDI:
                System.out.println("Presque le week-end!");
                break;
            default:
                System.out.println("Jour normal");
        }


        System.out.println("-----------------");

        Niveau n = Niveau.ELEVE;
        System.out.println("Valeur : du niveau "+ n.name() +" "+ n.getValeur());

    }
}
