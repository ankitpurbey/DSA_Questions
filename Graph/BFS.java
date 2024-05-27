package Graph;

import java.util.ArrayList;
import java.util.Queue;

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
        graph[0].add(new edge(s:0, d:1));
        graph[0].add(new edge(s:0, d:2));

        graph[1].add(new edge(s:1, d:0));
        graph[1].add(new edge(s:1, d:3));

        graph[2].add(new edge(s:2, d:0));
        graph[2].add(new edge(s:2, d:4));

        graph[3].add(new edge(s:3, d:1));
        graph[3].add(new edge(s:3, d:4));
        graph[3].add(new edge(s:3, d:5));

        graph[4].add(new edge(s:4, d:2));
        graph[4].add(new edge(s:4, d:3));
        graph[4].add(new edge(s:4, d:5));

        graph[5].add(new edge(s:5, d:3));
        graph[5].add(new edge(s:5, d:4));
        graph[5].add(new edge(s:5, d:6));

    }
    public static void bfs(ArrayList<edge> graph){
        Queue<Integer> q =new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr =q.remove();
            if(vis[curr]==false){
                System.out.println(curr +" ");
                vis[curr] =true;
                for(int i=0; i<graph[curr].size(); i++){
                    edge e = graph[curr].get(i);
                    q.add(e.dist);
                }
            }
            
        }
    }

    public static void main(String[] args) {
        int v =7;
        /*
           1====3
          /     |  \
         0      | 5--6
         \      | /
          2-----4


         */
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        bfs(graph,v);
        System.out.println();
    }
}
