public class Exercise1_4_10 {
    public static void main(String[] args){
        int hands = Integer.parseInt(args[0]);
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        int M = suit.length;
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"};
        int N = number.length;
        String[][] deck = new String[M][N];
        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                deck[i][j] = number[j] + " of " + suit[i];
            }
        }
        for(int k = 0; k<N;k++) {
            for (int l = 0; l < 5; l++) {
                int a = (int) (Math.random() * M);
                int b = (int) (Math.random() * N);
                System.out.print(deck[a][b] + ", ");
            }
            System.out.println();
        }
    }
}
