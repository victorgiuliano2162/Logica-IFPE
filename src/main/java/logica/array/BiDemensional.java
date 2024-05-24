package logica.array;

public class BiDemensional {
    public static void main(String[] args) {

        int[][] a1 = new int[3][3];

        for (int i = 0; i < a1.length; i++){
            for(int j = 0; j < a1[i].length; j++) {
                a1[i][j] = i;
                a1[i][j] = j;
            }
        }

        for (int i = 0; i < a1.length; i++){
            System.out.println();
            for(int j = 0; j < a1[i].length; j++) {
                System.out.print(a1[i][j] + " ");
            }
        }
    }
}
