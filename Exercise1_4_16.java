public class Exercise1_4_16 {
    public static void main(String[] args){
        Double[][] a = {
                {99.0, 85.0, 98.0},
                {98.0, 57.0, 78.0},
                {92.0, 77.0, 76.0},
                {94.0, 32.0, 11.0},
                {99.0, 34.0, 22.0},
                {90.0, 46.0, 54.0},
                {76.0, 59.0, 88.0},
                {92.0, 66.0, 89.0},
                {97.0, 71.0, 24.0},
                {89.0, 29.0, 38.0}
        };
        for(int i = 0; i < 10; i++){
            a[i][0] = 0.25*a[i][0];
        }
        System.out.println();
        for(int j = 0; j <10;j++){
            a[j][1] = 0.25*a[j][1];
        }
        System.out.println();
        for(int k = 0; k<10; k++){
            a[k][2] = 0.5*a[k][2];
        }
        for(int x = 0; x <10; x++){
            for(int y = 0; y <3; y++){
                System.out.print(a[x][y] + " ");
            }
            System.out.println();
        }
    }
}
