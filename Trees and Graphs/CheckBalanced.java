class CheckBalanced{
	public static void main(String[] args){
		int[] arr= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		Tree t = new Tree();
		for(int i=0;i<arr.length;i++){
			t.insertNode(arr[i]);
		}
		System.out.println(isBalanced(t,t.root));
		t.showTree();
	}
	public static boolean isBalanced(Tree t,TreeNode n){
		if(n!=null){
			int val=Math.abs(t.height(n.left)-t.height(n.right));
		
			if (val<=1){
				return isBalanced(t,n.left)&&isBalanced(t,n.right);
			}
			else{
				return false;
			}
		}
		return true;
		
	}
}