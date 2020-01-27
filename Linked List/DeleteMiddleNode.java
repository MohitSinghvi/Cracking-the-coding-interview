//Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.
//EXAMPLE lnput:the node c from the linked lista->b->c->d->e->f Result: nothing is returned, but the new linked list looks like a->b->d->e->f
//time: O(N), space:O(1) 

//Checkout LinkedList.java for implementation of LinkedList
class DeleteMiddleNode{
	public static void main(String[] args){
		LinkedList l = LinkedList.getExampleList();
		l.show();
		//lets say we are deleting the middle node
		//finding the middle node:
		Node p1,p2;//two pointers
		p1=l.head;
		p2=p1;
		while(p2.next!=null){
			p2=p2.next.next;
			p1=p1.next;
		}
		//Passing the middle node only
		deleteMiddleNode(p1);
		l.show();
		
	}
	//This function shifts the node right to the "middle node" to left by one place, and then deletes the next node.
	public static void deleteMiddleNode(Node m){
		
		m.val=m.next.val;
		m.next=m.next.next;
	}
}