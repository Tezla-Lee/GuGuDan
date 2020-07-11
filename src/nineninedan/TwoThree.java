package nineninedan;

public class TwoThree {

	public static void main(String[] args) {

		int dan;
		int count;
		
		for (dan = 2; dan <= 3; dan++) {
			
			for( count = 1; count <= 9; count++) {
				
				System.out.println(dan + " X " + count + " = " + count * dan);
			}
			
			System.out.println();
		}
	}

}
