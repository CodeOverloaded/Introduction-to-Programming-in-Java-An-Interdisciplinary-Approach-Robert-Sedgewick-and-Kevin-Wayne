public class Exercise1_3_21 {
    public static void main(String[] args)
    {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int T = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;
        int t = 0;
        while ( t < T)
        {
            int cash = stake;
            while (cash > 0 && cash < goal)
            {
                bets++;
                if (Math.random() < 0.5) cash++;
                else cash--;
            }
            if (cash == goal) wins++;
            t++;
        }
        System.out.println(100*wins/T + "% wins");
        System.out.println("Avg # bets: " + bets/T);
    }
}
