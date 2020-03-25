// Implementation of linked list data structure.
class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val=val;
		this.next=null;
	}
	
}
public class LinkedList{
	Node head;
	
	//to append a node at the end
	public void append(int val){
		Node new_node = new Node(val);
		Node temp = head;
		if(head==null){
			head=new_node;
		}
		else{
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new_node;
		}
	}
	public LinkedList insert(int val){
		Node new_node = new Node(val);
		new_node.next=head;
		head=new_node;
		return this;
	} 
	
	//To Print the linked list
	public void show(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println("");
	}
	//To generate an example linked list.
	public static LinkedList getExampleList(){
		LinkedList l = new LinkedList();
		l.append(9);
		l.append(1);
		l.append(8);
		l.append(5);
		l.append(2);
		l.append(1);
		l.append(9);
		l.append(4);
		l.append(2);
		return l;
	}
	//To get the length of the linked list
	public int length(){
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	
}