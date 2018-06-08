public class Exercise1_3_27 {
    public static void main(String[] args){
        int width = Integer.parseInt(args[0]);
        int length = Integer.parseInt(args[1]);
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
