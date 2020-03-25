class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val=val;
		left=null;
		right=null;
	}
}
class Tree{
	TreeNode root;
	public void put(TreeNode n, int input){
		if(input>n.val){
			if(n.right==null){
				TreeNode newNode = new TreeNode(input);
				n.right=newNode;
			}
			else{
				put(n.right,input);
			}
		}
		else{
			if(n.left==null){
				TreeNode newNode = new TreeNode(input);
				n.left=newNode;
				
			}
			else{
				put(n.left,input);
			}
		}
	}
	public void insertNode(int val){
		if(root==null){
			root = new TreeNode(val);
		}
		else{
			put(root,val);
		}
	}
	public void formBst(int[] arr, int start, int end){
		if(start<end){
			int mid = (int)((start+end-1)/2);
			insertNode(arr[mid]);
			formBst(arr, start, mid);
			formBst(arr, mid+1, end);
		}
	}
	public void showTree(){
		traverse(root);
	}
	public void traverse(TreeNode n){
		if(n.left!=null){
			traverse(n.left);
		}
		System.out.println(n.val);
		if(n.right!=null){
			traverse(n.right);
		}
		
	}
	public int height(TreeNode node){
		if(node==null){
			return 0;
		}
		int left_height=height(node.left);
		int right_height=height(node.right);
		return 1+((left_height>right_height)?left_height:right_height);
	}
}
class MinimalTree{
	public static void main(String[] args){
		int[] arr= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		// formBst(arr,0,arr.length);
		Tree t = new Tree();
		
		t.formBst(arr,0,arr.length);
		t.showTree();
		System.out.println(t.height(t.root));
	}
	
	
}