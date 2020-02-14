// Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
// Time: O(N)
// Space: O(1)
class LoopDetection{
	public static void main(String[] args){
		LinkedList l1= new LinkedList();
		l1.append(1);
		l1.append(2);
		l1.append(3);
		l1.append(4);
		Node n = new Node(5);
		Node temp1 = l1.head;
		while(temp1.next!=null){
			temp1=temp1.next;
		}
		temp1.next=n;
		l1.append(6);
		l1.append(7);
		l1.append(8);
		l1.append(11);
		
		temp1 = l1.head;
		while(temp1.next!=null){
			temp1=temp1.next;
		}
		temp1.next=n;
		
		Node loopStartNode=getLoopStartNode(l1);
		System.out.println(loopStartNode+" "+loopStartNode.val);
		
		
	}
	public static Node getLoopStartNode(LinkedList l1){
		
		
		Node p1,p2;
		p1=l1.head;
		p2=p1;
		while(p2!=null){
			Node p2p=p2;
			p1=p1.next;
			p2=p2.next.next;
			// System.out.println(p1.val);
			// System.out.println(p2.val);
			if(p1==p2){
				
				// System.out.println(p2.val);
				break;
			}
		}
		p1=l1.head;
		while(p1!=p2 && p2!=null){
			p1=p1.next;
			p2=p2.next;
		}
		return p1;
	}
}