class BST{
	class BSTNode{
		int val;
		BSTNode left;
		BSTNode right;
		BSTNode parent;
		
		public BSTNode(int val){
			this.val=val;
			left=null;
			right=null;
			parent=null;
		}
		
	}
	BSTNode root;
	
	public void putNode(BSTNode node, int val){
		
		if(val<=node.val){
			if(node.left!=null){
				putNode(node.left,val);
			}
			else{
				BSTNode new_node= new BSTNode(val);
				node.left=new_node;
				new_node.parent=node;
			}
		}
		else{
			if(node.right!=null){
				putNode(node.right,val);
			}
			else{
				BSTNode new_node= new BSTNode(val);
				node.right=new_node;
				new_node.parent=node;
			}
		}
	}
	
	public void insert(int val){
			
		if(root==null){
			BSTNode new_node= new BSTNode(val);
			root=new_node;
		}
		else{
			putNode(root,val);
		}
	}
	
	public void show(){
		showBST(root);
	}	
	public void showBST(BSTNode node){
		if(node!=null){
			showBST(node.left);
			System.out.println(node.val);
			showBST(node.right);
		}
	}
	public BSTNode getInorderSuccessor(BSTNode node){
		
		if(node.right!=null){
			BSTNode temp=node.right;
			while(temp.left!=null){
				temp=temp.left;
			}
			return temp;
		}
		else{
			
			
			BSTNode temp = node;
			while(temp.parent!=null){
				if(temp.parent.left!=null){
					if(temp==temp.parent.left){
						break;
					}
				}
				temp=temp.parent;
				
			}
			return temp.parent;
		}
		
	}
	
}
class Successor{
	public static void main(String[] args){
		BST t = new BST();
		
		t.insert(50);
		t.insert(35);
		t.insert(95);
		t.insert(27);
		t.insert(43);
		t.insert(37);
		t.insert(46);
		t.insert(45);
		t.insert(87);
		t.insert(79);
		
		t.show();
		
		BST.BSTNode n = t.root;
		System.out.println("\n Successor of "+n.val+" "+t.getInorderSuccessor(n).val);
		
		
		

	}
}






















