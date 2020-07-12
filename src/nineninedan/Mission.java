package nineninedan;
import java.util.Scanner;
public class Mission {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇 단까지 출력하시겠습니까? (ex 8입력 -> 88단까지)");
		int dan = scanner.nextInt();
		
		for(int i =  2; i  <=  dan; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= dan; j++) {
				System.out.println(i*j);
			}
			System.out.println();
		}
	
	}

}
