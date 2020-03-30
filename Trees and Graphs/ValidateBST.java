class Max{
	int max;
	public void Max(){
		max=Integer.MAX_VALUE;
	}
}
class ValidateBST{
	public static void main(String[] args){
		Tree t = new Tree();
		t.insertNode(5);
		t.root.left=new TreeNode(6);
		t.root.right=new TreeNode(4);
		t.showTree();
		Max m1 = new Max();
		Max m2 = new Max();
		Max m3 = new Max();
		System.out.println(t.isBST(t.root,m1));
		
		
		int[] arr= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		Tree t2 = new Tree();
		t2.formBst(arr,0,arr.length);
		t2.showTree();
		System.out.println(t2.isBST(t2.root,m2));
		
		
		Tree t3 = new Tree();
		for(int i=0;i<arr.length;i++){
			t3.insertNode(arr[i]);
		}
		t3.showTree();
		System.out.println(t2.isBST(t2.root,m3));
		
	}
	
}