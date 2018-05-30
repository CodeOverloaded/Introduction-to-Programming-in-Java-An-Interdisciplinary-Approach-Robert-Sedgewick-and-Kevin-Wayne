public class Exercise1_2_34 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println("Input: " + a + ", " + b + ", " + c);
        a = Math.min(Math.min(a,b),c);
        b = Math.min(b,c);
        System.out.println("Output: " + a + ", " + b + ", " + c);
    }
}
