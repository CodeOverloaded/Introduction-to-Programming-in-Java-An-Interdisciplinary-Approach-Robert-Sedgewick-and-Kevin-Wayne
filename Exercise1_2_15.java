public class Exercise1_2_15 {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);
		if(((x+y)>z) || ((x+z)>y)) {
			System.out.println("False");
		} else if((y+z)>x){
			System.out.println("False");	
		} else {
			System.out.println("True");
		}
	}
}
