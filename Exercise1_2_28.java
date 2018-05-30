public class Exercise1_2_28 {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);
		if(x<y && x<z) {
			if(y<z) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}else {
			System.out.println("False");
		}
	}

}
