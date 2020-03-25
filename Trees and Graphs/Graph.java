public class Graph{
	LinkedList[] root;
	boolean[] visited;
	
	public Graph(int size){
		root = new LinkedList[size];
		visited=new boolean[size];
		for(int i=0;i<size;i++){
			visited[i]=false;
		}
	}
	public void showVisitedArray(){
		for(int i=0;i<visited.length;i++){
			
			System.out.print(visited[i]+" ");
		}
	}
	public void show(){
		System.out.println("Graph: ");
		for(int i=0;i<root.length;i++){
			if(root[i]!=null){
				System.out.print(i+" : ");
				root[i].show();
			}
		}
	}
	public void addEdge(int i,int j){
		if(root[i]==null){
			root[i]=new LinkedList();
		}
		root[i].append(j);
		
		// System.out.println(i+" , "+j);
	}
	
}