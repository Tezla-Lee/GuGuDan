package nineninedan;

public class GuGuDan {

	public static void main(String[] args) {

		// 2단 3단
//		int dan;
//		int count;
//		
//		for (dan = 2; dan <= 3; dan++) {
//			
//			for( count = 1; count <= 9; count++) {
//				
//				System.out.println(dan + " X " + count + " = " + count * dan);
//			}
//			
//			System.out.println();
//		}

		// 6단
		
		
//		int i = 1;
//
//		while(i < 10) {		
//			System.out.println(6 * i);		
//			i++;
//		}
//		
//		// 7단
//		i = 1;
//		while(i < 10) {		
//			System.out.println(7 * i);		
//			i++;
//		}

		
		int[] result = new int[9];
		
		for (int j = 0; j < 8; j++) {
			System.out.println((j +2) + "단");
			for (int i = 0; i< result.length; i++) {
				
				result[i] = (j + 2) * (i + 1);
				System.out.println(result[i]);
			}
			System.out.println();
		}

		
		
		
	}

}
