package Ch05;

public class P165 {
	public static void main(String[] args) {
		//�⺻ �ڷ����� ���� ����
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println();
		
		//���� �ڷ����� ���� ����
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		array2[0] = 7;
		System.out.println(array1[0]);
		System.out.println(array2[0]);
	}
}