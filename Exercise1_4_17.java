public class Exercise1_4_17 {
    public static void main(String[] args) {
        Double[][] a = {
                {99.0, 85.0, 98.0},
                {98.0, 57.0, 78.0},
                {70.0, 60.0, 75.0}
        };
        Double[][] b = {
                {99.0, 98.0, 70.0},
                {85.0, 57.0, 60.0},
                {98.0, 78.0, 75.0},
        };
        double sum = 0.0;
        int a_row = 0;
        int a_col = 0;
        int b_row = 0;
        int b_col = 0;
        int m = b[b_row].length;
        int n = a[a_row].length;
        Double[][] c = new Double[m][m];
        for (a_row = 0; a_row < m; a_row++) {
            for (b_col = 0; b_col < m; b_col++) {
                c[a_row][b_col] = 0.0;
            }
        }
        for(a_row = 0; a_row < m; a_row++){
            for(b_col = 0; b_col < m; b_col++){
                for(a_col = 0; a_col < n; a_col++){
                    c[a_row][b_col] = c[a_row][b_col] + a[a_row][a_col]*b[b_row][b_col];
                }
            }
        }
        for (a_row = 0; a_row < m; a_row++) {
            for (b_col = 0; b_col < m; b_col++) {
                System.out.print(c[a_row][b_col] + " ");
            }
            System.out.println();
        }
    }
}

