//Palindrome: Implement a function to check if a linked list is a palindrome.
//Time: O(N)
//Space: O(N)
class Pali{
	boolean isTrue;
	Node partner;
}
class Palindrome{
	public static void main(String[] args){
		LinkedList l= new LinkedList();
		l.append(1);
		l.append(2);
		l.append(9);
		l.append(8);
		l.append(7);
		l.append(9);
		l.append(2);
		l.append(1);
		Pali ans =isPalindrome(1,l.length(),l.head);
		System.out.println(ans.isTrue);
		
		
	}
	
	public static Pali isPalindrome(int start, int end, Node n){
		Pali paliobj;
		if(start==end){
			paliobj= new Pali();
			paliobj.isTrue=true;
			paliobj.partner=n.next;
			return paliobj;
		}
		if(start==end-1){
			if(n.val==n.next.val){
				paliobj= new Pali();
				paliobj.isTrue=true;
				paliobj.partner=n.next.next;
				return paliobj;
			}
			paliobj= new Pali();
			paliobj.isTrue=false;
			paliobj.partner=n;
			return paliobj;
			
		}
		else {

			paliobj = isPalindrome(start+1,end-1,n.next);
			if(n.val==paliobj.partner.val && paliobj.isTrue==true){
				paliobj.partner=paliobj.partner.next;
				return paliobj;
			}
			else{
				paliobj.isTrue=false;
				return paliobj;
			}
		}
		

	}
}