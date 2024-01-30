package test_clone_method;

public class ObjectCopyUsingAssignmentOperator {
	int x,y;
	
	public ObjectCopyUsingAssignmentOperator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		ObjectCopyUsingAssignmentOperator o1 = new ObjectCopyUsingAssignmentOperator(10, 90);
		 System.out.println(o1.x + "   " + o1.y);
		ObjectCopyUsingAssignmentOperator o2 =o1;
		o2.x=89;
		System.out.println(o1.x+"   "+o1.y);
		System.out.println(o2.x+"   "+o2.y);
	}
}
