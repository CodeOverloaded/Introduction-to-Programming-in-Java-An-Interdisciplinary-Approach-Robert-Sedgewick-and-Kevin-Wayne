public class Exercise1_2_31 {
    public static void main(String[] args){
        double l0 = Double.parseDouble(args[0]);
        double l = Double.parseDouble(args[1]);
        double p = Double.parseDouble(args[2]);
        double x = l-l0;
        double y = (0.5*Math.log((1+Math.sin(p))/(1-Math.sin(p))));
        System.out.println(x+", "+y);
    }
}
