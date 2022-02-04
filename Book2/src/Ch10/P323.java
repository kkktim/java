package Ch10;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class P323 {
	public static void main(String[] args) {
		//업캐스팅(자동변환): 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
		A ac = (A) new C();
		B bc = (B) new C();
		
		B bb = new B();
		A a = (A) bb;
		
		//다운캐스팅(수동변환): 캐스팅할 수 없을 때(실행할 때 예외 발생)
		A aa = new A();
		B b = (B) aa;
		C c = (C) aa;
		
		//다운캐스팅(수동변환): 캐스팅이 가능할 때
		A ab = new B();
//		B b = (B) ab;     // A->B 다운캐스팅(수동변환)
//		C c = (C) ab;     // A->C 다운캐스팅(수동변환):불가능
		
		B bd = new D();
		B d = (D) bd;
		
		A ad = new D();
		B b1 = (B) ad;
		D d1 = (D) ad;
		
		
	}
}
