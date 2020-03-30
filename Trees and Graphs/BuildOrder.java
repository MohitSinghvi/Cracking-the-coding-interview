import java.util.*;
import java.util.Queue;
class Graph{
	
	HashMap<String,List<String>> map = new HashMap<>();
	HashMap<String,Integer>num_inc = new HashMap<>();
	String[] vertices;
	public void addEdge(String first, String second){
		if(!map.containsKey(first)){
			List<String> l = new ArrayList<>();
			l.add(second);
			map.put(first,l);
		}
		else{
			map.get(first).add(second);
			
		}
		num_inc.put(second,num_inc.get(second)+1);
		
	}
	public void buildOrder(){
		Queue<String> q = new LinkedList<>();
		for(String v : vertices){
			if(num_inc.get(v)==0){
				q.add(v);
			}
		}
		
		while(q.peek()!=null){
			String p = q.remove();
			System.out.println(p);
			if(map.containsKey(p)){
				for(int i =0;i<map.get(p).size();i++){
					
					num_inc.put(map.get(p).get(i),num_inc.get(p)-1);
					String s = map.get(p).get(i);
					// System.out.println(p+" "+s+" "+num_inc.get(p));
					if(num_inc.get(p)<=0 && !q.contains(s)){
						q.add(s);
					}
					
				}
			}
		}
	}
	
	
	
	
	
}
class BuildOrder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int no_of_vertices=sc.nextInt();
		int no_of_edges=sc.nextInt();
		Graph g=new Graph();
		sc.nextLine(); 
		String[] vertices=sc.nextLine().split(" ",0);
		g.vertices=vertices;
		for(int i=0;i<no_of_vertices;i++){
			g.num_inc.put(vertices[i],0);
		}
		for(int i=0;i<no_of_edges;i++){
			String[] sd = sc.nextLine().split(" ",0) ;
			g.addEdge(sd[0],sd[1]);
	
		}
		g.buildOrder();
		
		
		
		
		
	}
}