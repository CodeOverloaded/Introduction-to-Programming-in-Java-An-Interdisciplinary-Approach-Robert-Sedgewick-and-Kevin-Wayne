public class Exercise1_3_30 {
    public static void main(String[] args){
        int k = Integer.parseInt(args[0]);
        int i = 0;
        while((long)(Math.pow(k,i))<Long.MAX_VALUE){
            i++;
            System.out.println(Math.pow(k,i));
        }
    }
}
