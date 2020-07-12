package nineninedan;
import java.util.Scanner;
public class Mission2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\"x,x\"단까지 출력하시겠습니까?");
		String  dan = scanner.nextLine();
		String [] splitedValue = dan.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for ( int i = 2; i <= first; i++) {
			System.out.println(i + "단");
			for ( int j =1; j <= second; j++) {
				System.out.println(i * j);
			}
			System.out.println();
		}
	}

}
