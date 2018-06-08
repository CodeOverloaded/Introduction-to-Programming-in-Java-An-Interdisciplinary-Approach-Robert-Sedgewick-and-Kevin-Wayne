public class Exercise1_4_4 {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        String[] a = {"1 ", "2 ", "3 ", "4 ", "5 "};
        System.out.print(a[0] + " ");
        System.out.print(a[1] + " ");
        System.out.print(a[2] + " ");
        System.out.print(a[3] + " ");
        System.out.print(a[4] + " ");
        for(int i = 0; i<a.length; i++){
            String t = a[a.length-i-1];
            System.out.print(t + " ");
        }
    }
}
