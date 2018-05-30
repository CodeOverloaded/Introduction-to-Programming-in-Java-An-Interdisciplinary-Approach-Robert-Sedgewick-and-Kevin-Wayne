public class Exercise1_2_32 {
    public static void main(String[] args){
        double r = Double.parseDouble(args[0]);
        double g = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        if(r==0 && g==0){
            if(b==0){
                int k = 1;
                int c = 0;
                int m = 0;
                int y = 0;
                System.out.println("c= " + c);
                System.out.println("m= " + m);
                System.out.println("y= " + y);
                System.out.println("k= " + k);
            }
        } else{
            double w = Math.max(Math.max(r/255,g/255),b/255);
            double c = (w-(r/255))/w;
            double m = (w-(g/255))/w;
            double y = (w-(b/255))/w;
            double k = 1-w;
            System.out.println("c= " + c);
            System.out.println("m= " + m);
            System.out.println("y= " + y);
            System.out.println("k= " + k);
        }
        System.out.println("r= " + r);
        System.out.println("g= " + g);
        System.out.println("b= " + b);

    }
}
