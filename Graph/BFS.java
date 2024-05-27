package Graph;

import java.util.ArrayList;

public class BFS {
    public static class edge {
    int src=s;
    int dist = d;
    public edge(int s, int d){
        this.src =s;
        this.dist =d;
    }
        
    }
    public void createGraph(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<edge>()
        }
    }
}
