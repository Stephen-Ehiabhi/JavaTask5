public class Two_Dimen {
    public static void main(String[] args) {
        int n = 10, total = 0;
        int[][] matrix = new int[n][n];

        int[] numbers = new int[10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = i;
                    total += matrix[i][j];
                }else{
                    matrix[i][j] = 0;
                }
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("The sum of the diagonals is: " + total);

    }
}
