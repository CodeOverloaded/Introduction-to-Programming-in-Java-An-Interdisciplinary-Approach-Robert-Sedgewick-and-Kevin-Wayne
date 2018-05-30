public class Exercise1_3_9 {
    public static void main(String[] args){
        double sum = 0;
        int N = Integer.parseInt(args[0]);
        for(int i=1;i<=N;i++){
            double x = Math.random();
            System.out.println(x);
            sum = sum + x;
        }
        System.out.println(sum/N);
    }
}
