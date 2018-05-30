public class Exercise1_2_20 {
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int rand = (int)((Math.random()*((y-x)+1)+x));
		int rand2 = (int)((Math.random()*((y-x)+1)+x));
		System.out.println(rand+rand2);
	}
}
