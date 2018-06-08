public class Exercise1_3_19 {
    public static void main(String[] args){
        long i = Long.parseLong(args[0]);
        int v = 1;
        int k = Integer.parseInt(args[1]);
        while (v <= i/k){
            v=v*k;
        }
        while(v>0){
            if(i<v){
                System.out.print(0);

            } else {
                int c = 1;
                while(c*v<=i){
                    c++;
                }
                c--;
                if(c>=10){
                    switch(c%10){
                        case 0: System.out.print("A");
                        case 1: System.out.print("B");
                        case 2: System.out.print("C");
                        case 3: System.out.print("D");
                        case 4: System.out.print("E");
                        case 5: System.out.print("F");
                    }
                }else{
                    System.out.print(c);
                }
                i = i - (c*v);
            }
            v = v/k;
        }
        System.out.println();
    }
}
