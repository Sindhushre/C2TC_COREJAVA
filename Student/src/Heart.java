
public class Heart {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[15]);
		for(int i =-3*n/2; i<=n; i++) {
			 for (int j=-3*n/2; j <=3*n/2; j++) {
				 
				 if((Math.abs(i) + Math.abs(j) < n)
						 || ((-n/2-i) * (-n/2-i) * (-n/2-j) <=n*n/2)
						 || ((-n/2-i) * (-n/2-i) * (-n/2-j) <=n*n/2)) {
					 System.out.print("* ");
				 }
				 else {
					 System.out.print(". ");
				 }
				 
				 }
			 System.out.println();
			 }
		}

	}


