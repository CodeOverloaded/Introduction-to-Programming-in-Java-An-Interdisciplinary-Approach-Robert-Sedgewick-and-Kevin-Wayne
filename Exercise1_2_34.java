public class Exercise1_2_34 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println("Initial: " + a + ", " + b + ", " + c);
        System.out.println(Math.min(Math.min(a,b),c));
        System.out.println(Math.max(Math.min(a,b),Math.min(Math.max(a,b),c)));
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
