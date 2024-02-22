package acessmodifier;

public class A {
	private void m1() {
		System.out.println("m1 - private");
	}
void m2() {
	System.out.println("m2 - default");
}
protected void m3() {
	System.out.println("m3 - protected");
}
public void m4() {
	System.out.println("m4 - public");
}
public static void main(String[] args) {
	A a = new A();
	a.m1();
	a.m2();
	a.m3();
	a.m4();
}}
