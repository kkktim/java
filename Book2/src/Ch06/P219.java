package Ch06;
// Ŭ���� (�ؾ ���) ����
class A {
	int m = 3;
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}
}

public class P219 {
	public static void main(String[] args) {
		
		// Ŭ������ ��ü(�ؾ) ����
		A a = new A();
		
		// Ŭ���� ��� Ȱ��(�ؾ �Ա�)
		// @�ʵ� Ȱ�� : �ʵ忡 ���� �б�/����
		
		a.m = 5;
		System.out.println(a.m);
		
		// @�޼��� Ȱ�� : �޼��带 ȣ��
		a.print();
		
	}

}
