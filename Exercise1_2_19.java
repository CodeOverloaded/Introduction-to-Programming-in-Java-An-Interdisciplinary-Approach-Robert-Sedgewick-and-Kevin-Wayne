public class Exercise1_2_19 {
	public static void main(String[] arg) {
		int x = Integer.parseInt(arg[0]);
		int y = Integer.parseInt(arg[1]);
		int rand=x+(int)((Math.random()*((y-x)+1)));
		System.out.println(rand);
	}
}
