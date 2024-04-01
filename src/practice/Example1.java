package practice;

public class Example1 {
	
	int m1(int y) {
		int[] arr = {1,2};
		System.out.println(arr[2]);
		try {
			int x = 10;
			int ans = x/y;
			System.out.println(ans);
			//return  ans;
		}catch(ArithmeticException ae) {
			System.out.println("hi");
			//return 100;
		}
		catch(StringIndexOutOfBoundsException se) {
			
		}
		finally {
			//return 200;
		}
		return 300;
	}
	public static void main(String[] args) {
		int ans = new Example1().m1(0);
		System.out.println(ans);
	}

}
