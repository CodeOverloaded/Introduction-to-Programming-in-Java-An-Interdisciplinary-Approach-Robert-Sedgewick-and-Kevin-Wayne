public class Exercise1_2_29 {
	public static void main(String[] args) {
		double m = Double.parseDouble(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		double y0=y-((14-m)/12);
		double x=y0 + y0/4 - y0/100 + y0/400;
		double m0=m + 12*((14-m)/12)-2;
		int d0=(int)(d+x+(31*m0)/12)%7;
		if(d0==1) {
			System.out.println("Monday");
		} else if (d0==2) {
			System.out.println("Tuesday");
		} else if (d0==3) {
			System.out.println("Wednesday");
		} else if (d0==4) {
			System.out.println("Thursday");
		} else if (d0==5) {
			System.out.println("Friday");
		} else if (d0==6) {
			System.out.println("Saturday");
		} else if (d0==0) {
			System.out.println("Sunday");
		}
	}
}
