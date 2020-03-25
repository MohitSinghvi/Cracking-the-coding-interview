public class Queue{
	Node front;
	Node rear;
	public void enqueue(int a){
		if(front==null){
			LinkedList l = new LinkedList();
			l.append(a);
			front=l.head;
			rear=l.head;
		}
		else{
			
			Node t = new Node(a);
			rear.next=t;
			rear=rear.next;
		}
	}
	public int dequeue(){
		
		int val;
		if(front!=null){
			val = front.val;
			front=front.next;
		}
		else{
			val=-999;
		}
		
		return val;
	}
	public boolean isEmpty(){
		if(front==null){
			return true;
		}
		else{
			return false;
		}
	}
	public void show(){
		Node temp = front;
		while(temp!=null){
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println("");
	}
}