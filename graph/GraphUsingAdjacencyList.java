package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphUsingAdjacencyList {
    private LinkedList<Integer>[] adjList;

    private int V;
    private int E;

    public GraphUsingAdjacencyList(int nodes){
        this.E=0;
        this.V=nodes;
        this.adjList=new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.adjList[i]=new LinkedList<>();

        }
    }

    public void addEdge(int u,int v){
        this.adjList[u].add(v);
        this.adjList[v].add(u);
        E++;
    }

    public String tostring(){
        StringBuilder sb=new StringBuilder();
        sb.append(V+" vertices "+E+" edges "+"\n");
        for(int v=0;v<V;v++){
            sb.append(v+": ");
            for (int w : adjList[v]) {
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();

    }

    public void bfs(int s){
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" ");
            for (Integer v : adjList[u]) {
                if(!visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }

            }

        }

    }

    public void dfs(int s){
        boolean[] visited= new boolean[V];
        Stack<Integer> stack=new Stack<>();
        stack.push(s);
        while(!stack.isEmpty()){
            int u=stack.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.print(u+" ");
                for (Integer v : adjList[u]) {
                    if(!visited[v]){
                        stack.push(v);
                    }
                    
                }
            }

        }
    }
    

    public static void main(String[] args) {

        GraphUsingAdjacencyList g= new GraphUsingAdjacencyList(4);
        
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        System.out.println(g.tostring());
        
        g.bfs(0);
        System.out.println();
        g.dfs(0);
    }
    
}
