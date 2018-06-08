public class Exercise1_3_14 {
    public static void main(String[] args){
        int N = 0;
        int power = 0;
        if(Integer.parseInt(args[0])<0){
            System.out.println("N is negative");
        }else if (Integer.parseInt(args[0])>2147483647){
            System.out.println("N is too large");
        }else{
            N = Integer.parseInt(args[0]);
        }
        while(N>1){
            while(Math.pow(2,power)<N){
                power++;
            }
            power--;
            N = N - (int)Math.pow(2,power);
            System.out.println(Math.pow(2,power));
            power=0;
        }
    }
}
