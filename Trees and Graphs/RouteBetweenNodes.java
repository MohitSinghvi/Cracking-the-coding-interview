import java.util.Scanner;

public class RouteBetweenNodes{
	public static void main(String[] args){
		Graph graph = new Graph(6);
		
		graph.addEdge(0,1);
		graph.addEdge(1,2);
		graph.addEdge(1,3);
		graph.addEdge(2,5);
		graph.addEdge(3,4);
		graph.addEdge(3,5);
		graph.addEdge(4,2);
		graph.addEdge(4,5);


		graph.show();

		Scanner sc = new Scanner(System.in);
		print("Enter nos : ");
		System.out.println(routeDFS(graph,sc.nextInt(),sc.nextInt()));
		// routeBFS(graph,sc.nextInt(),sc.nextInt());
		graph.showVisitedArray();
	
		
		
	}
	public static void print(String s){
		System.out.println(s);
	}
	public static boolean routeDFS(Graph graph,int k,int j){
		
		graph.visited[k]=true;
		if(j==k){
				return true;
		}
		if(graph.root[k]!=null){
			LinkedList temp = graph.root[k];
			Node temp_head=temp.head;
			boolean val=false;
			System.out.println("k: "+k+" j: "+j);
			
			while(temp_head!=null){
				if(graph.visited[temp_head.val]==false){
					val=val || routeDFS(graph,temp_head.val,j);
				}
				temp_head=temp_head.next;
			}
			return val;
			
		}
		return false;
		
	}
	// public static void routeBFS(Graph graph,int k,int j){
		// Queue q = new Queue();
		// q.enqueue(k);
		// while(!q.isEmpty()){
			// q.show();
			// int val = q.dequeue();
			// graph.visited[val]=true;
			// LinkedList temp = graph.root[k];
			// Node temp_head=temp.head;
			// while(temp_head!=null){
				
				// if(graph.visited[temp_head.val]==false){
					// q.enqueue(temp_head.val);
				// }
				// temp_head=temp_head.next;
			// }
			
			
		// }
		
	// }
	
	
}