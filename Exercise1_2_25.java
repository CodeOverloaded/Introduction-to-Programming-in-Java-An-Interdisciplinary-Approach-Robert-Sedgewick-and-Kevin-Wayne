public class Exercise1_2_25 {
	public static void main(String[] args) {
		double T = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		if ((Math.abs(T)>50) || (v>120 || v<3)) {
			System.out.println("Enter valid inputs");
		} else {
			System.out.println(35.74+0.6215*T+(0.4275*T-35.75)*Math.pow(v, 0.16));
		}
	}
}
