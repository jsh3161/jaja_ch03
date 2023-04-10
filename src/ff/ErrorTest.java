package ff;

public class ErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=10;
		double divide=0;
		
		try {
			divide=a/b;
		} catch (ArithmeticException e) {
			System.out.println("모든수는 0으로 나눌수 없다");
		}
	
	}

}
