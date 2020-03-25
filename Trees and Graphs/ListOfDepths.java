class Node{
	TreeNode content;
	Node next;
	Node(TreeNode content){
		this.content=content;
		next=null;
	}
}
class LinkedList{
	Node head;
	Node last;
	public void append(TreeNode val){
		Node new_node = new Node(val);
		if(head == null){
			head = new_node;
			last=new_node;
		}
		else{
			last.next=new_node;
			last=last.next;
		}
	}
}
class ListOfDepths{
	public static void main(String[] args){
		int[] arr= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		Tree t = new Tree();
		t.formBst(arr,0,arr.length);
		t.showTree();
		int th=t.height(t.root);
		
		LinkedList[] arr_of_list_of_tree_nodes= new LinkedList[th];
		arr_of_list_of_tree_nodes[0]=new LinkedList();
		arr_of_list_of_tree_nodes[0].append(t.root);
		
		for(int i=0;i<th-1;i++){
			Node temp = arr_of_list_of_tree_nodes[i].head;
			arr_of_list_of_tree_nodes[i+1]=new LinkedList();
			while(temp!=null){
				arr_of_list_of_tree_nodes[i+1].append(temp.content.left);
				arr_of_list_of_tree_nodes[i+1].append(temp.content.right);
				temp=temp.next;
			}
		}
		for(int i=0;i<th;i++){
			Node temp = arr_of_list_of_tree_nodes[i].head;
			while(temp!=null){
				System.out.print(temp.content.val+" ");
				temp=temp.next;
			}
			System.out.println();
		
		}
		
		
		
		
	}
}
