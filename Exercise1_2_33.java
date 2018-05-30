public class Exercise1_2_33 {
    public static void main(String[] args){
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        System.out.println(60*Math.acos(Math.sin(Math.toRadians(x1))*(Math.sin(Math.toRadians(x2))))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
    }
}
