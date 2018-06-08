public class Exercise1_3_19 {
    public static void main(String[] args){
        int i = Integer.parseInt(args[0]);
        int v = 1;
        int k = Integer.parseInt(args[1]);
        while( v <= i/k){
            v = v*k;
        }
        while(v<0){
            if(i<v){
                System.out.print(0);
            } else{
                System.out.print(i/v);
                i = i-v;
                v=v/k;
            }
        }
        System.out.println();
    }
}
