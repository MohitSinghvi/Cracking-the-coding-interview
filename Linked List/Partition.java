// Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x. If xis contained within the list, the values of x only need to be after the elements less than x (see below). The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.
import java.util.Scanner;
class Partition{
	public static void main(String[] args){
		LinkedList l = LinkedList.getExampleList();
		l.show();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		partition(l,k);
		l.show();
	}
	public static void partition(LinkedList l, int k){
		Node temp=l.head;
		Node i,j,previ;
		i=j=l.head;
		while(j!=null){
			System.out.println(i.val+" "+j.val);
			if(j.val<k && i!=j){
				if(i.val<k){
					i=i.next;
				}
				int t= i.val;
				i.val=j.val;
				j.val=t;
				i=i.next;
			}
			
			j=j.next;
			l.show();

		}

	}	
}