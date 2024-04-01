package p1;

public class C extends B implements A{
	
	public void m1() {
		//super.B(10);
		System.out.println("this is interface implemented method m1()");
	}
	public void m2() {
		
	}
	C(int x){
		super(10);
	}
	
	public void m3() {
		
	}
	
	public static void main(String[] args) {
		//C c1 = new C();
		//A a = new C();
		//B b = new C();
		//B b1 = new B(1);
		
		//b1.m1();
		
		//c1.m1();
		//a.m1();
		//b.m1();
	}

}
