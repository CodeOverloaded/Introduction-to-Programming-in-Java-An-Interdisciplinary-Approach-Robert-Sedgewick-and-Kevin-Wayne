public class Exercise1_4_12 {
    public static void main(String[] args){
        int[][] a = {
                {99, 85, 98},
                {98, 57, 78},
                {92, 77, 76},
                {94, 32, 11},
                {99, 34, 22},
                {90, 46, 54},
                {76, 59, 88},
                {92, 66, 89},
                {97, 71, 24},
                {89, 29, 38}
        };
        int[][] b = new int[3][10];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<10;j++){
                b[i][j]=a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
