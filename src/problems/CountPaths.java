package problems;

import java.util.LinkedList;

public class CountPaths {
	
	
	static class Graph{
		
		int vertices;
		LinkedList<Integer>[] adjactedList;
		
		public Graph(int vertices) {
		
			this.vertices = vertices;
			adjactedList = new LinkedList[vertices];
			for (int i = 0 ; i < vertices ; i++ ) {
				adjactedList[i] = new LinkedList<Integer>();
			}
		
		}
		
		public void addEgde(int source, int destination){
			adjactedList[source].addFirst(destination);
        }
		
		int count = 0; 
		public int findTotalNumberPaths(int source, int destination){
			count = 0;
			
			find(source,destination);
			
			
			return count; 
		}
		
		public void find(int source, int destination){
			
			if(source == destination){
				count++;
			}else{
				for (Integer nodes : adjactedList[source]) {
					find(nodes,  destination);
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Graph gp = new Graph(6);
		gp.addEgde(0, 1);
        gp.addEgde(0, 2);
        gp.addEgde(1, 2);
        gp.addEgde(1, 3);
        gp.addEgde(3, 4);
        gp.addEgde(2, 3);
        gp.addEgde(4, 5);
        int source =0;
        int destination=5;
        System.out.println(gp.findTotalNumberPaths(source,destination));
	}

}
