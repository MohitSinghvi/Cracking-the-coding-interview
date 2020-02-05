// Sum Lists:You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.

class SumLists{
	public static void main(String[] args){
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
		
		l1.append(9);
		l1.append(7);
		l1.append(8);
		l2.append(6);
		l2.append(8);
		l2.append(5);
		l1.show();
		l2.show();
		LinkedList output = getLinkedListSum(l1,l2);
		
		int l1_len=l1.length();
		int l2_len=l2.length();
		if(l1_len>l2_len){
			while(l1_len>l2_len){
				l1.insert(0);
				l1_len+=1;
			}
		}
		else{
			while(l2_len>l1_len){
				l2.insert(0);
				l2_len+=1;
			}
		}
		int c=lSum(l1.head,l2.head,l3);
		if((int)(c/10)==1){
			l3.insert(1);
		}
		output.show();
		l3.show();
		
	}
	
	//Caculate sum considering the Digits in reverse order
	//Time: O(N)
	//Space: O(1)
	public static LinkedList getLinkedListSum(LinkedList l1, LinkedList l2){
		Node p1,p2;
		p1=l1.head;
		p2=l2.head;
		int carry=0;
		LinkedList output = new LinkedList();
		while(p1!=null || p2!=null){
			int value=0;
			if(p1!=null){
				value+=p1.val;
				// System.out.println(p1.val);
				p1=p1.next;
				
			}
			if(p2!=null){
				value+=p2.val;
				// System.out.println(p2.val);
				p2=p2.next;
				
			}
			value=value+carry;
			if(value>9){
				value=value-10;
				carry=1;
			}
			else{
				carry=0;
			}
			output.append(value);
				
		}
		if(carry==1){
			output.append(1);
		}
		return output;
		
	}
	
	//Calculate Sum considering the digits in the actual order
	//Time: O(N)
	//Space: O(N)
	public static int lSum(Node a,Node b, LinkedList s){
		int r;
		
		if(a.next==null && b.next==null){
			r=a.val+b.val;
			s=s.insert(r%10);
			return r;
		}
		else{
			r=(a.val+b.val+((int)(lSum(a.next,b.next,s)/10)));
			s=s.insert(r%10);
			return r;
		}
	}

	
}