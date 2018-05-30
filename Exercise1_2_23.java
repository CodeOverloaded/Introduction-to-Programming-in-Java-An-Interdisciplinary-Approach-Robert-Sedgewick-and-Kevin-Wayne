public class Exercise1_2_23 {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		if(m>=3 && m<=6) {
			if(m==3) {			
				if (d>=20 && d<=31) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			} else if (m==4) {
				if(d>0 && d<=30) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			} else if (m==5) {
				if (d>0 && d<=31) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			}else {
				if (d>0 && d<=20) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			}
		} else {
			System.out.println("False");
		}
	}
}
