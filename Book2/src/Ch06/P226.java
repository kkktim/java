package Ch06;
// 클래스 생성(정의)
class C {
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalVariable() {
		int k;
		//System.out.println(k);
	}
}
public class P226 {
	public static void main(String[] args) {
		//클래스를 활용해 객체 생성
		C a = new C();
		//객체 활용
		a.printFieldValue();
	}

}
