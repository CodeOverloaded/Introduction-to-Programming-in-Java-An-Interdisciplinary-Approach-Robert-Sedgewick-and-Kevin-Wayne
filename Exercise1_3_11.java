public class Exercise1_3_11 {
    public static void main(String[] args){
        int N =16;
        for(N=16;N<=2048;N*=2){
            System.out.print(Math.log10(N));
            System.out.print("\t");
            System.out.print(N);
            System.out.print("\t");
            System.out.print(N*Math.log10(N));
            System.out.print("\t");
            System.out.print(N*N);
            System.out.print("\t");
            System.out.print(N*N*N);
            System.out.print("\t");
            System.out.print(Math.pow(2,N));
            System.out.println();

        }
    }
}
