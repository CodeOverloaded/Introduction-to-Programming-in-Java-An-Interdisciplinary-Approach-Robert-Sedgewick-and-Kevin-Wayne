public class Exercise1_3_31 {
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double x = (2*a)*Math.sqrt(1-a*a-b*b);
        double y = (2*b)*Math.sqrt(1-a*a-b*b);
        double z = 1-2*(a*a+b*b);
        System.out.println("x= " +x);
        System.out.println("y= " + y);
        System.out.println("z= " + z);
    }
}
