public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
        int[][] twoDArray = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twoDArray[i][j] = i + j;
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.println(twoDArray[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
