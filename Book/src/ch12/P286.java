package ch12;
//�ϴ���
class Obj {
	int obj_var;
	
	Obj(int obj_var){
		this.obj_var = obj_var;
	}
}

class ObjOverride {
	int obj_var;
	
	ObjOverride(int obj_var) {
		this.obj_var = obj_var;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ObjOverride) {
			return true ;
		}else {
			return false;
		}
	}
}

public class P286 {
	public static void main(String[] args) {
		Obj obj1 = new Obj(100);
		Obj obj2 = new Obj(100);
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 ��ü�� obj2 ��ü�� ����");
		}else {
			System.out.println("obj1 ��ü�� obj2 ��ü�� �ٸ�");
		}
		
		Obj obj3 = obj1;
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1 ��ü�� obj3 ��ü�� ����");
		}else {
			System.out.println("obj1 ��ü�� obj3 ��ü�� �ٸ�");
		}
		
		ObjOverride objo1 = new ObjOverride(100);
	}

}
