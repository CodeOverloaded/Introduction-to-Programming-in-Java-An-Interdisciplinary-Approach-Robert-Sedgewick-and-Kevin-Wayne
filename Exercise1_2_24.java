public class Exercise1_2_24 {
	public static void main(String[] args) {
		double P = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1])*0.01;
		double t = Double.parseDouble(args[2]);
		System.out.println(P*(Math.pow(Math.E,(r*t))));
	}
}
