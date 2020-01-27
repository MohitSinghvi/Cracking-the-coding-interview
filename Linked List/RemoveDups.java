//Remove Dups: Write code to remove duplicates from an unsorted linked list.
//time: O(N), space: O(N)

//Checkout LinkedList.java for implementation of LinkedList
import java.util.HashMap;
import java.util.Scanner;

class RemoveDups{
	public static void main(String[] args){
		LinkedList l1= LinkedList.getExampleList();
		l1.show();
		removeDups(l1);
		l1.show();
		
	}
	
	public static void removeDups(LinkedList l1){
		HashMap<Integer,Integer> dict = new HashMap<>();
		Node temp=l1.head;
		Node prev=temp;
		while(temp!=null){
			if(dict.containsKey(temp.val)){
				if(temp.next!=null){
					prev.next=temp.next;
				}
				else{
					prev.next=null;
				}
			}
			else{
				dict.put(temp.val,1);
			}
			prev=temp;
			temp=temp.next;
		}
		
	}
}