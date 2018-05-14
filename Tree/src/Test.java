
public class Test {

	public static void main(String[] args) {
		
		Tree t = new Tree(1);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(3);

		Tree t3 = new Tree(4);

		Tree t4 = new Tree(5);

		Tree t5 = new Tree(8);

		Tree t6 = new Tree(6);

		Tree t7 = new Tree(7);

		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);

		t1.setRight(t4);

		t2.setRight(t5);

		t5.setRight(t6);

		t6.setRight(t7);
		
		int res = maxheight(t);
		
		System.out.println(res);
		
	}

	private static int maxheight(Tree t) {
		
		if(t == null){
		
			return 0;
			
		}
		
		return height(t.getLeft()) + height(t.getRight())+1;
	}

	private static int height(Tree left) {
		
		if(left == null){
			
			return 0;
			
		}
		
		int lh = height(left.getLeft());
		
		int rh = height(left.getRight());
		
		return 1+Math.max(lh,rh);
	}
	
	
}
