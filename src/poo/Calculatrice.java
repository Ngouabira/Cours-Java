package poo;

public class Calculatrice {

    //Surcharger une méthode
    public static float somme(int x, int y){
        return x + y;
    }

    public static float somme(int x, int y, int z){
        return z + y + x;
    }

    public static float calcule(int x, int y){
        return  x+y;
    }

    public static float calcule(int x, String signe , int y){
        return switch (signe) {
            case "+"  -> x+y;
            case "-" -> x-y;
            case "/" -> x/y;
            case "*" -> x*y;
            default -> x+y;
        };
    }


}
