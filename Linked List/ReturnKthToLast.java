//Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
//time: O(N), space: O(1)

//Checkout LinkedList.java for implementation of LinkedList
import java.util.Scanner;
class ReturnKthToLast{
	public static void main(String[] args){
		LinkedList l1=LinkedList.getExampleList();
		l1.show();
		Scanner sc= new Scanner(System.in);
		System.out.println(getKthToLast(l1,sc.nextInt()));
	}
	public static int getKthToLast(LinkedList l1,int k){
		Node temp1=l1.head;
		Node temp2=temp1;
		int count=0;
		while(temp2!=null){
			if(count>=k){
				temp1=temp1.next;
			}
			temp2=temp2.next;
			count+=1;
		}
		return temp1.val;
		
		
	}
}