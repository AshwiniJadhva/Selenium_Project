package practice;

public class A  extends Object{
	
	static void m1() {
		String str = "ajinkya";
		String str2 = "ashwiniwe";
		str.equals(str);
		str.equalsIgnoreCase(str);
		str.toString();
		int ans  = str.compareTo(str2);
		System.out.println(ans);
		
	}
	public static void main(String[] args) {
		A.m1();
	}

}
