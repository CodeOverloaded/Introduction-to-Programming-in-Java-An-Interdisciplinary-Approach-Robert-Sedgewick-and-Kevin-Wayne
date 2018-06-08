public class Exercise1_3_28 {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if(x>y && x%y==0){
            System.out.println("GCD= " + y);
        }else if (x>y && x%y!=0){
            while(x%y !=0){
                int temp = x;
                x = y;
                y = temp%y;
            }
            System.out.println("GCD= " + y);
        }else{
            System.out.println("x is less than y");
        }
    }
}
