public class Exercise1_4_21 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];
        int count = 1;
        int j = 0;
        for (int i = 0; i < N; i++) {
            a[i] = (int) (Math.random() * N);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        while (j<N-1) {
            if(a[j]==a[j+1]){
                count++;
                System.out.print(j + " and " + (j+1) + " ");
                j++;
            }else{
                j++;
            }
        }
        System.out.println();
        if(count==1){
            System.out.println("No contiguous sequence of equal values");
        }
    }
}

