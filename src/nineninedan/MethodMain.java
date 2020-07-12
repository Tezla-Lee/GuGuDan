package nineninedan;

public class MethodMain {

	public static void main(String[] args) {

		for(int i = 2; i < 10; i++) {
			int[] result = Method.calculate(i);
			Method.print(result);
		}
	}
}
