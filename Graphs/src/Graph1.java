import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Graph1 {

	//vertices of graph
	int V;
	
	//array of lists to store adjacent vertices.
	LinkedList<Integer> adj[];
	
	public Graph1(int i){
		
		V = i;
		
		adj = new LinkedList[i];
		
		for(int j=0;j<i;j++){
			
			adj[j] = new LinkedList<Integer>();
			
		}
		
	}
		
		public void addEdge(int a, int b){
			
			adj[a].add(b);
			
		
		}
	
	void BFS(int s){
		
		boolean [] visited = new boolean[V];
		
		visited[s] = true;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(s);
		
		
		while(!q.isEmpty()){
			
			int g1 = q.poll();
			
			System.out.print(g1+" ");
			
			Iterator<Integer> it = adj[g1].iterator();
			
			while(it.hasNext()){
				
				int h = it.next();
				
				if(!visited[h]){
					
					visited[h] = true;
					
				q.add(h);
					
				}
				
			}
			
		}
		
		
	}
		
	
}
