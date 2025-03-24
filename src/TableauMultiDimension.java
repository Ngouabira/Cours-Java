public class TableauMultiDimension {

    public static void main(String[] args) {

        int[][] tableau = new int[3][2];

        tableau[0][0] = 1;
        tableau[0][1] = 2;

        int[][] tableau2 = {
                {1,2},
                {3,4},
                {5,6}
        };

        //Goupe 1,1
        System.out.println(tableau2[1][1]);

        for (int i = 0; i < tableau2.length; i++) {
            for (int j = 0; j < tableau2[i].length; j++) {
                System.out.println("Nombre :"+tableau2[i][j]);
            }

        }
    }
}
