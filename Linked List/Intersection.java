//Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.
//Time: O(M+N)
//Space: O(1)
class Intersection{
	public static void main(String[] args){
		LinkedList l1= new LinkedList();
		LinkedList l2= new LinkedList();
		
		l1.append(1);
		l1.append(2);
		
		l2.append(11);
		l2.append(12);
		
		Node n = new Node(9);
		Node temp1 = l1.head;
		Node temp2 = l2.head;
		while(temp1.next!=null || temp2.next!=null){
			temp1=temp1.next;
			temp2=temp2.next;   
			
		}
		temp1.next=n;
		temp2.next=n;
		
		l1.append(21);
		l1.append(22);
		l1.append(23);
		l1.show();
		l2.show();
		
		System.out.println(getIntersection(l1,l2).val);
		
	}
	public static Node getIntersection(LinkedList l1, LinkedList l2){
		Node temp1 = l1.head;
		Node temp2 = l2.head;
		int len1,len2;
		len1=len2=0;
		while(temp1.next!=null){
			temp1=temp1.next; 
			len1+=1;
		}
		while(temp2.next!=null){
			temp2=temp2.next; 
			len2+=1;
		}
		// System.out.println(temp1.val);
		// System.out.println(temp2.val);
		if(temp1==temp2){
			int len=Math.abs(len2-len1);
			temp1 = l1.head;
			temp2 = l2.head;
			Node small,big;
			
			if(len2>len1){
				big=temp2;
				small=temp1;
			}
			else{
				big=temp1;
				small=temp2;
			}
			while(big!=null){
				
				if(len==0){
					if(small==big){
						return small;
					}
					else{
						big=big.next;
						small=small.next;
					}
					
				}
				else{
					big=big.next;
					len-=1;
				}
			}
		}
		return null;
	}
	
}